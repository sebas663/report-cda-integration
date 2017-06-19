package org.fleni.cda.externalreport.repositories;

import java.util.List;

import org.fleni.cda.externalreport.dto.CdaContainer;
/**
 * 
 * @author sebastian
 *
 */
public interface ICdaContainerRepository {
	/**
	 * 
	 * @param table
	 * @param where
	 * @return
	 */
	List<CdaContainer> findAllCdaContainerByParams(String table, String where);
}
