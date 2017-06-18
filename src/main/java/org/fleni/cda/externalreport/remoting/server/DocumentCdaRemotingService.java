package org.fleni.cda.externalreport.remoting.server;

import javax.jws.WebService;
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

	@Override
	public DocumentCdaCandidates findDocumentCda(DocumentCdaInformation documentCdaInformation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentCdaCandidates getLinkImageStudy(String studyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
