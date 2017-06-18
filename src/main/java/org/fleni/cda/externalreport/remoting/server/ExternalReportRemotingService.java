package org.fleni.cda.externalreport.remoting.server;

import javax.jws.WebService;

import org.fleni.cda.externalreport.remoting.dto.ExternalReportInformation;
import org.fleni.cda.externalreport.remoting.dto.ExternalReportResponse;

/**
 * 
 * @author sebastian
 * EndPoint : http://localhost:8080/cda-mais-integration/ws/ExternalReportRemotingService?wsdl
 * 
 */
@WebService(serviceName = "externalReportRemotingService", 
		    portName = "ExternalReportRemotingService", 
		    targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/",
		    endpointInterface = "org.fleni.cda.externalreport.remoting.server.IExternalReportRemotingService")
public class ExternalReportRemotingService implements IExternalReportRemotingService {

	@Override
	public ExternalReportResponse createReportInformation(ExternalReportInformation externalReportInformation) {
		// TODO Auto-generated method stub
		return null;
	}

}
