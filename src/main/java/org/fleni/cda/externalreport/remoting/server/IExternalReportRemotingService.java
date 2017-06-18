package org.fleni.cda.externalreport.remoting.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.fleni.cda.externalreport.remoting.dto.ExternalReportInformation;
import org.fleni.cda.externalreport.remoting.dto.ExternalReportResponse;

/**
 * 
 * @author sebastian
 *
 */
@WebService(targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", name = "IExternalReportRemotingService")
public interface IExternalReportRemotingService {
	/**
	 * 
	 * @param myname
	 * @return
	 */
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "createReportInformation", targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", className = "org.fleni.cda.externalreport.remoting.dto.ExternalReportInformation")
	@WebMethod(action = "urn:CreateReportInformation")
	@ResponseWrapper(localName = "createReportInformationResponse", targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/", className = "org.fleni.cda.externalreport.remoting.dto.ExternalReportResponse")
	ExternalReportResponse createReportInformation(
			@WebParam(name = "externalReportInformation", targetNamespace = "") ExternalReportInformation externalReportInformation);
}
