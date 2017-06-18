package org.fleni.cda.externalreport.configuration;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.fleni.cda.externalreport.remoting.server.DocumentCdaRemotingService;
import org.fleni.cda.externalreport.remoting.server.ExternalReportRemotingService;
import org.fleni.cda.externalreport.remoting.server.LaboratoryCdaRemotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 
 * @author sebastian
 *
 */
@Configuration
public class WebServiceConfig {
	/**
	 * 
	 */
	@Autowired
	private Bus bus;

	/**
	 * 
	 * @return
	 */
	@Bean
	public Endpoint externalReportRemotingService() {
		EndpointImpl endpoint = new EndpointImpl(bus, new ExternalReportRemotingService());
		endpoint.publish("/ExternalReportRemotingService");
		return endpoint;
	}

	/**
	 * 
	 * @return
	 */
	@Bean
	public Endpoint documentCdaRemotingService() {
		EndpointImpl endpoint = new EndpointImpl(bus, new DocumentCdaRemotingService());
		endpoint.publish("/DocumentCdaRemotingService");
		return endpoint;
	}

	/**
	 * 
	 * @return
	 */
	@Bean
	public Endpoint laboratoryCdaRemotingService() {
		EndpointImpl endpoint = new EndpointImpl(bus, new LaboratoryCdaRemotingService());
		endpoint.publish("/LaboratoryCdaRemotingService");
		return endpoint;
	}

}
