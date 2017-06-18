package org.fleni.cda.externalreport.dto;

import java.util.Date;
/**
 * 
 * @author sebastian
 *
 */
public class CdaContainer {
	/**
	 * 
	 */
	private Long id;
	/**
	 * 
	 */
	private Long externalReportTypeID;
	/**
	 * 
	 */
	private String reportId;
	/**
	 * 
	 */
	private Date reportDate;
	/**
	 * 
	 */
	private Long reportVersion;
	/**
	 * 
	 */
	private String reportOriginalId;
	/**
	 * 
	 */
	private String nhc;
	/**
	 * 
	 */
	private String episodeNumber;
	/**
	 * 
	 */
	private String typeEpisode;
	/**
	 * 
	 */
	private Date creationDate;
	/**
	 * 
	 */
	private byte[] messageJsonData;
	/**
	 * 
	 */
	private byte[] messageCdaData;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the externalReportTypeID
	 */
	public Long getExternalReportTypeID() {
		return externalReportTypeID;
	}

	/**
	 * @param externalReportTypeID
	 *            the externalReportTypeID to set
	 */
	public void setExternalReportTypeID(Long externalReportTypeID) {
		this.externalReportTypeID = externalReportTypeID;
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
	 * @return the reportVersion
	 */
	public Long getReportVersion() {
		return reportVersion;
	}

	/**
	 * @param reportVersion
	 *            the reportVersion to set
	 */
	public void setReportVersion(Long reportVersion) {
		this.reportVersion = reportVersion;
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
	 * @return the typeEpisode
	 */
	public String getTypeEpisode() {
		return typeEpisode;
	}

	/**
	 * @param typeEpisode
	 *            the typeEpisode to set
	 */
	public void setTypeEpisode(String typeEpisode) {
		this.typeEpisode = typeEpisode;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
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
	 * @return the messageCdaData
	 */
	public byte[] getMessageCdaData() {
		return messageCdaData;
	}

	/**
	 * @param messageCdaData
	 *            the messageCdaData to set
	 */
	public void setMessageCdaData(byte[] messageCdaData) {
		this.messageCdaData = messageCdaData;
	}

}
