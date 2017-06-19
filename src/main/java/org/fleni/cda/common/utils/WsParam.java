package org.fleni.cda.common.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

import org.fleni.cda.common.remoting.IntegrationResponseCode;
/**
 * 
 * @author sebastian
 *
 */
public class WsParam {
	/**
	 * 
	 */
	Optional<String> documentId;
	/**
	 * 
	 */
	Optional<String> documentName;
	/**
	 * 
	 */
	Optional<String> episodeNumber;
	/**
	 * 
	 */
	Optional<String> fromDate;
	/**
	 * 
	 */
	Optional<String> nhc;
	/**
	 * 
	 */
	Optional<String> toDate;
	/**
	 * 
	 */
	private String whereFromParam;

	/**
	 * 
	 * @return
	 */
	public Integer validateInformationAndCreateWhere() {
		Integer response = IntegrationResponseCode.SUCCESS.getCode();
		StringBuilder str = new StringBuilder("");
		boolean valid = false;
		if (this.getDocumentId().isPresent()) {
			valid = true;
			str.append(" documentId = " + this.getDocumentId().get());
		}
		if (this.getDocumentName().isPresent()) {
			valid = true;
			if (str.length() > 0) {
				str.append(" AND ");
			}
			str.append(" documentName = " + this.getDocumentName().get());
		}
		if (this.getEpisodeNumber().isPresent()) {
			valid = true;
			if (str.length() > 0) {
				str.append(" AND ");
			}
			str.append(" episodeNumber = " + this.getEpisodeNumber().get());
		}
		if (this.getNhc().isPresent()) {
			valid = true;
			if (str.length() > 0) {
				str.append(" AND ");
			}
			str.append(" nhc = " + this.getNhc().get());
		}
		try {
			String format = "dd/MM/yyyy hh:mm:ss";
			String formatOracle = "dd/MM/yyyy hh:mi:ss";
			LocalDateTime fromDateTime = null;
			LocalDateTime toDateTime = null;
			String fromD = null;
			String toD = null;
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
			if (this.getFromDate().isPresent()) {
				valid = true;
				fromDateTime = LocalDateTime.parse(this.getFromDate().get() + " 00:00:00", formatter);
				fromD = fromDateTime.format(formatter);

			}
			if (this.getToDate().isPresent()) {
				valid = true;
				toDateTime = LocalDateTime.parse(this.getToDate().get() + " 23:59:59", formatter);
				toD = toDateTime.format(formatter);
			}
			if (this.getFromDate().isPresent() && this.getToDate().isPresent()) {
				if (str.length() > 0) {
					str.append(" AND ");
				}
				str.append(" report_date BETWEEN TO_DATE('" + fromD + "','" + formatOracle + "') " + "AND TO_DATE('"
						+ toD + "','" + formatOracle + "') ");
			}
			if (this.getFromDate().isPresent() && !this.getToDate().isPresent()) {
				if (str.length() > 0) {
					str.append(" AND ");
				}
				str.append(" report_date >= TO_DATE('" + fromD + "','" + formatOracle + "') ");
			}
			if (this.getToDate().isPresent() && !this.getToDate().isPresent()) {
				if (str.length() > 0) {
					str.append(" AND ");
				}
				str.append(" report_date <= TO_DATE('" + toD + "','" + formatOracle + "') ");
			}

		} catch (DateTimeParseException e) {
			valid = false;
		}
		this.whereFromParam = str.toString();
		if (!valid) {
			response = IntegrationResponseCode.INCOMPLETE_DATA.getCode();
		}
		return response;
	}
	/**
	 * 
	 * @return
	 */
	public String getWhereFromParam(){
		return this.whereFromParam;
	}
	/**
	 * @return the documentId
	 */
	public Optional<String> getDocumentId() {
		return documentId;
	}
	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(Optional<String> documentId) {
		this.documentId = documentId;
	}
	/**
	 * @return the documentName
	 */
	public Optional<String> getDocumentName() {
		return documentName;
	}
	/**
	 * @param documentName the documentName to set
	 */
	public void setDocumentName(Optional<String> documentName) {
		this.documentName = documentName;
	}
	/**
	 * @return the episodeNumber
	 */
	public Optional<String> getEpisodeNumber() {
		return episodeNumber;
	}
	/**
	 * @param episodeNumber the episodeNumber to set
	 */
	public void setEpisodeNumber(Optional<String> episodeNumber) {
		this.episodeNumber = episodeNumber;
	}
	/**
	 * @return the fromDate
	 */
	public Optional<String> getFromDate() {
		return fromDate;
	}
	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Optional<String> fromDate) {
		this.fromDate = fromDate;
	}
	/**
	 * @return the nhc
	 */
	public Optional<String> getNhc() {
		return nhc;
	}
	/**
	 * @param nhc the nhc to set
	 */
	public void setNhc(Optional<String> nhc) {
		this.nhc = nhc;
	}
	/**
	 * @return the toDate
	 */
	public Optional<String> getToDate() {
		return toDate;
	}
	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Optional<String> toDate) {
		this.toDate = toDate;
	}
	
}
