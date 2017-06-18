package org.fleni.cda.externalreport.remoting.dto;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * @author sebastian
 *
 */
@XmlRootElement(name = "externalReportResponse")
public class ExternalReportResponse {
	/**
	 * 
	 */
	private String code;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private String externalReportId;

	/**
	 * 
	 */
	public ExternalReportResponse() {
		super();
	}

	/**
	 * @param code
	 * @param description
	 * @param externalReportId
	 */
	public ExternalReportResponse(String code, String description, String externalReportId) {
		super();
		this.code = code;
		this.description = description;
		this.externalReportId = externalReportId;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the externalReportId
	 */
	public String getExternalReportId() {
		return externalReportId;
	}

	/**
	 * @param externalReportId
	 *            the externalReportId to set
	 */
	public void setExternalReportId(String externalReportId) {
		this.externalReportId = externalReportId;
	}

}
