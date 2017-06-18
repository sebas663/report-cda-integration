package org.fleni.cda.externalreport.remoting.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * 
 * @author sebastian
 *
 */
@WebService(targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "IDocumentCdaRemotingService")
public interface IDocumentCdaRemotingService {
	/**
	 * 
	 * @param documentCdaInformation
	 * @return
	 */
	@WebMethod
	@RequestWrapper(localName = "findDocumentCda", targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", className = "org.fleni.cda.externalreport.remoting.server.DocumentCdaInformation")
	@ResponseWrapper(localName = "findDocumentCdaResponse", targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", className = "org.fleni.cda.externalreport.remoting.server.DocumentCdaCandidates")
	@WebResult(name = "return", targetNamespace = "")
	public DocumentCdaCandidates findDocumentCda(
			@WebParam(name = "documentCdaInformation", targetNamespace = "") DocumentCdaInformation documentCdaInformation);

	/**
	 * 
	 * @param studyNumber
	 * @return
	 */
	@WebMethod
	@RequestWrapper(localName = "getLinkImageStudy", targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", className = "java.lang.String")
	@ResponseWrapper(localName = "getLinkImageStudyResponse", targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", className = "org.fleni.cda.externalreport.remoting.server.DocumentCdaCandidates")
	@WebResult(name = "return", targetNamespace = "")
	public DocumentCdaCandidates getLinkImageStudy(
			@WebParam(name = "studyNumber", targetNamespace = "") String studyNumber);
}
