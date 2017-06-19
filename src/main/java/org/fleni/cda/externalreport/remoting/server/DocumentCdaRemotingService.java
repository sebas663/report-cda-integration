package org.fleni.cda.externalreport.remoting.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.jws.WebService;

import org.fleni.cda.common.remoting.IntegrationResponseCode;
import org.fleni.cda.common.utils.WsParam;
import org.fleni.cda.externalreport.dto.CdaContainer;
import org.fleni.cda.externalreport.model.service.ICdaContainerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * 
 * @author sebastian
 * EndPoint : http://localhost:8080/cda-mais-integration/ws/DocumentCdaRemotingService?wsdl
 * 
 */
@WebService(serviceName = "documentCdaRemotingService", 
			portName = "DocumentCdaRemotingService", 
			targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/",
			endpointInterface = "org.fleni.cda.externalreport.remoting.server.IDocumentCdaRemotingService")
public class DocumentCdaRemotingService implements IDocumentCdaRemotingService{
	/**
	 * 
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(DocumentCdaRemotingService.class);
	/**
	 * 
	 */
	@Autowired
	private ICdaContainerService  cdaContainerService;
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.remoting.server.IDocumentCdaRemotingService#findDocumentCda(org.fleni.cda.externalreport.remoting.server.DocumentCdaInformation)
	 */
	@Override
	public DocumentCdaCandidates findDocumentCda(DocumentCdaInformation documentCdaInformation) {
		List<String> messageXmlDatas = null;
		WsParam param = new  WsParam();
		param.setDocumentId(Optional.ofNullable(documentCdaInformation.getDocumentId()));
		param.setDocumentName(Optional.ofNullable(documentCdaInformation.getDocumentName()));
		param.setEpisodeNumber(Optional.ofNullable(documentCdaInformation.getEpisodeNumber()));
		param.setFromDate(Optional.ofNullable(documentCdaInformation.getFromDate()));
		param.setNhc(Optional.ofNullable(documentCdaInformation.getNhc()));
		param.setToDate(Optional.ofNullable(documentCdaInformation.getToDate()));
		Integer response = param.validateInformationAndCreateWhere();		
		if (response == 0) {
			try {
				messageXmlDatas = findDocumentsXmlCdaData(param);
				if(messageXmlDatas.size() == 0){
					response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
				}
			} catch (Exception e) {
				response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
				LOGGER.error(e.getMessage(), e);
			}
		}				
		return createResponseReport(response, messageXmlDatas);
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.remoting.server.IDocumentCdaRemotingService#getLinkImageStudy(java.lang.String)
	 */
	@Override
	public DocumentCdaCandidates getLinkImageStudy(String studyNumber) {
		return null;
//		String link = "";
//		Integer response = 0;
//		String error = "";
//		try {
//			link = carestreamTokenRestService.getLinkPacks(studyNumber);
//		} catch (UnsupportedEncodingException e) {
//			response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
//			error = "[ Codificacion no soportada. doPostCall() ] " + e.getMessage();
//			LOGGER.error(error);
//		} catch (ConnectTimeoutException e) {
//			response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
//			LOGGER.error("[ No se obtuvo respuesta desde el servidor. ] " + e.getMessage());
//			error = "[ No se obtuvo respuesta desde el servidor. ]" + e.getMessage();
//		} catch (IOException e) {
//			response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
//			error = "[ No se obtuvo respuesta desde el servidor. ] " + e.getMessage();
//			LOGGER.error(error);
//		} 
//		return createResponseReport(response, link != null && !link.equals("")? link:error);
	}
	/**
	 * @param code
	 * @param messageXmlDatas
	 * @return
	 */
	private DocumentCdaCandidates createResponseReport(Integer code, List<String> messageXmlDatas) {
		DocumentCdaCandidates intReportResp = new DocumentCdaCandidates();
		intReportResp.setCode(code.toString());
		intReportResp.setDescription(IntegrationResponseCode.getDescriptionByCode(code));
//		intReportResp.setCdaDocuments(messageXmlDatas);		
		return intReportResp;
	}
	/**
	 * @param code
	 * @param messageXmlDatas
	 * @return
	 */
	private DocumentCdaCandidates createResponseReport(Integer code, String link) {
		DocumentCdaCandidates intReportResp = new DocumentCdaCandidates();
		intReportResp.setCode(code.toString());
		intReportResp.setDescription(IntegrationResponseCode.getDescriptionByCode(code));
		intReportResp.setLinkImageStudy(link);
		return intReportResp;
	}
	
	/**
	 * @param documentCdaInformation
	 * @return
	 * @throws Exception 
	 */
	private List<String> findDocumentsXmlCdaData(WsParam param) throws Exception {
		List<String> xmlDatas = new ArrayList<>();
		
//		long initALL = System.currentTimeMillis();
		// Getting: ExternalReportInfo
		List<CdaContainer> lst = cdaContainerService.findListCdaContainerByParameter(param);
//		long finALL = System.currentTimeMillis(); // Instante final del procesamiento
//		String tiempo = "Tiempo total findListExternalReportInfoByParameter: " + (finALL - initALL) / 1000 + " Segundos";
//		System.out.println(tiempo);
		
		if(lst != null){
//			Collections.sort(lst,new ExternalReportInfoComparatorDesc());
			for(CdaContainer c : lst){
				xmlDatas.add(new String(c.getMessageCdaData(), "UTF-8"));
			}
		}
		return xmlDatas;
	}

}
