package org.fleni.cda.externalreport.remoting.utils;

public enum DocumentCdaType {
	
	DISCHARGE("EPICRISIS",1),
	SURGICAL_PROTOCOL("PROTOCOLO QUIRURGICO",2),
	CLINIC_HISTORY_INCOME("HISTORIA CLINICA INGRESO",3),
	EVOLUTION("EVOLUCION INTERCONSULTA",4),
	INDICATIONS("HOJA DE INDICACIONES",5),
    NURSING("HOJA DE ENFERMERIA",6),
    PREADMISSION("INFORME MEDICO DE PREADMISION",7),
    REPORT_AP("INFORME DE ESTUDIO AP",8),
    ANESTHESIA_PROTOCOL("PROTOCOLO DE ANESTESIA",9),
    INFORMED_CONSENT("CONSENTIMIENTO INFORMADO",10),
    REPORT_LABORATORY("INFORME DE ESTUDIO LABORATORIO",11),
    PROCEDURE_PROTOCOL("PROTOCOLO DE PROCEDIMIENTO",12),
    REPORT_IMAGES("INFORME DE ESTUDIO IMAGENES",13),
    REPORT_OTHERS("INFORME DE ESTUDIO IMAGENES",13),
    REPORT_PREHOSPITAL("INFORME DE ATENCION PREHOSPITALARIA",14);
	
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private Integer code;
	
	/**
	 * @param description
	 */
	DocumentCdaType(String description,Integer code) {
		this.description = description;
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
}
