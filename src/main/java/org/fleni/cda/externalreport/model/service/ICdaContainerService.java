package org.fleni.cda.externalreport.model.service;

import java.util.List;

import org.fleni.cda.common.utils.WsParam;
import org.fleni.cda.externalreport.dto.CdaContainer;
/**
 * 
 * @author sebastian
 *
 */
public interface ICdaContainerService {
	/**
	 * 
	 * @param param
	 * @return
	 */
	List<CdaContainer> findListCdaContainerByParameter(WsParam param);
}
