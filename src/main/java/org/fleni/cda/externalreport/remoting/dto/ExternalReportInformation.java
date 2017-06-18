package org.fleni.cda.externalreport.remoting.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "externalReportInformation")
public class ExternalReportInformation {

	private String reportId;
	private String reportName;
	private Date reportDate;
	private Long version;
	private String reportOriginalId;
	private String nhc;
	private String episodeNumber;
	private String typeEpisode;
	private byte[] messageJsonData;
	private boolean isFirstTime;

	/**
	 * 
	 */
	public ExternalReportInformation() {
		super();
	}
	/**
	 * 
	 * @param reportId
	 * @param reportName
	 * @param reportDate
	 * @param version
	 * @param reportOriginalId
	 * @param nhc
	 * @param episodeNumber
	 * @param typeEpisode
	 * @param messageJsonData
	 * @param isFirstTime
	 */
	public ExternalReportInformation(String reportId, String reportName, Date reportDate, Long version,
			String reportOriginalId, String nhc, String episodeNumber, String typeEpisode, byte[] messageJsonData,
			boolean isFirstTime) {
		super();
		this.reportId = reportId;
		this.reportName = reportName;
		this.reportDate = reportDate;
		this.version = version;
		this.reportOriginalId = reportOriginalId;
		this.nhc = nhc;
		this.episodeNumber = episodeNumber;
		this.typeEpisode = typeEpisode;
		this.messageJsonData = messageJsonData;
		this.isFirstTime = isFirstTime;
	}
	/**
	 * @return the reportId
	 */
	public String getReportId() {
		return reportId;
	}
	
	/**
	 * @param reportId
	 *            the reportId to set
	 */
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	/**
	 * @return the reportName
	 */
	public String getReportName() {
		return reportName;
	}

	/**
	 * @param reportName
	 *            the reportName to set
	 */
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	/**
	 * @return the reportDate
	 */
	public Date getReportDate() {
		return reportDate;
	}

	/**
	 * @param reportDate
	 *            the reportDate to set
	 */
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	/**
	 * @return the version
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

	/**
	 * @return the reportOriginalId
	 */
	public String getReportOriginalId() {
		return reportOriginalId;
	}

	/**
	 * @param reportOriginalId
	 *            the reportOriginalId to set
	 */
	public void setReportOriginalId(String reportOriginalId) {
		this.reportOriginalId = reportOriginalId;
	}

	/**
	 * @return the nhc
	 */
	public String getNhc() {
		return nhc;
	}

	/**
	 * @param nhc
	 *            the nhc to set
	 */
	public void setNhc(String nhc) {
		this.nhc = nhc;
	}

	/**
	 * @return the episodeNumber
	 */
	public String getEpisodeNumber() {
		return episodeNumber;
	}

	/**
	 * @param episodeNumber
	 *            the episodeNumber to set
	 */
	public void setEpisodeNumber(String episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	/**
	 * @return the messageJsonData
	 */
	public byte[] getMessageJsonData() {
		return messageJsonData;
	}

	/**
	 * @param messageJsonData
	 *            the messageJsonData to set
	 */
	public void setMessageJsonData(byte[] messageJsonData) {
		this.messageJsonData = messageJsonData;
	}

	/**
	 * @return the typeEpisode
	 */
	public String getTypeEpisode() {
		return typeEpisode;
	}

	/**
	 * @param typeEpisode the typeEpisode to set
	 */
	public void setTypeEpisode(String typeEpisode) {
		this.typeEpisode = typeEpisode;
	}
	/**
	 * @return the isFirstTime
	 */
	public boolean isFirstTime() {
		return isFirstTime;
	}
	/**
	 * @param isFirstTime the isFirstTime to set
	 */
	public void setFirstTime(boolean isFirstTime) {
		this.isFirstTime = isFirstTime;
	}

}
