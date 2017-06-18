package org.fleni.cda.externalreport.remoting.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * 
 * @author sebastian
 *
 */
@WebService(targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "ILaboratoryCdaRemotingService")
@XmlSeeAlso({ ObjectFactory.class })
public interface ILaboratoryCdaRemotingService {

	@WebMethod
	@RequestWrapper(localName = "sendCDALaboratory", targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", className = "java.lang.String")
	@ResponseWrapper(localName = "sendCDALaboratoryResponse", targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", className = "org.fleni.cda.externalreport.remoting.server.ExternalReportResponse")
	@WebResult(name = "return", targetNamespace = "")
	public ExternalReportResponse sendCDALaboratory(@WebParam(name = "cda", targetNamespace = "") String cda);
}
