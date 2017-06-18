package org.fleni.cda.externalreport.remoting.server;

import javax.jws.WebService;
/**
 * 
 * @author sebastian
 * EndPoint : http://localhost:8080/cda-mais-integration/ws/LaboratoryCdaRemotingService?wsdl
 * 
 */
@WebService(serviceName = "laboratoryCdaRemotingService", 
			portName = "LaboratoryCdaRemotingService", 
			targetNamespace = "http://server.remoting.externalreport.cda.fleni.org/",
			endpointInterface = "org.fleni.cda.externalreport.remoting.server.ILaboratoryCdaRemotingService")
public class LaboratoryCdaRemotingService implements ILaboratoryCdaRemotingService {

	@Override
	public ExternalReportResponse sendCDALaboratory(String cda) {
		// TODO Auto-generated method stub
		return null;
	}

}
