package org.fleni.cda.externalreport.model.service;

import java.util.ArrayList;
import java.util.List;

import org.fleni.cda.common.utils.WsParam;
import org.fleni.cda.externalreport.dto.CdaContainer;
import org.fleni.cda.externalreport.remoting.utils.DocumentCdaType;
import org.fleni.cda.externalreport.repositories.ICdaContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author sebastian
 *
 */
@Service
public class CdaContainerService implements ICdaContainerService{
	/**
	 * 
	 */
	@Autowired
	private ICdaContainerRepository repository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.fleni.cda.externalreport.model.service.ICdaContainerService#
	 * findListCdaContainerByParameter(org.fleni.cda.common.utils.WsParam)
	 */
	@Override
	public List<CdaContainer> findListCdaContainerByParameter(WsParam param) {
		List<CdaContainer> all = new ArrayList<>();
		List<CdaContainer> discharge = null;
		List<CdaContainer> ap = null;
		List<CdaContainer> image = null;
		List<CdaContainer> laboratory = null;
		discharge = repository.findAllCdaContainerByParams("cda_episcrisis",
				buildWhere(param, DocumentCdaType.DISCHARGE.getCode()));
		ap = repository.findAllCdaContainerByParams("cda_ap", buildWhere(param, DocumentCdaType.REPORT_AP.getCode()));
		image = repository.findAllCdaContainerByParams("cda_image",
				buildWhere(param, DocumentCdaType.REPORT_IMAGES.getCode()));
		laboratory = repository.findAllCdaContainerByParams("cda_laboratorio",
				buildWhere(param, DocumentCdaType.REPORT_LABORATORY.getCode()));

		if (discharge != null)
			all.addAll(discharge);
		if (ap != null)
			all.addAll(ap);
		if (image != null)
			all.addAll(image);
		if (laboratory != null)
			all.addAll(laboratory);
		// discharge.parallelStream()
		// .collect(Collectors.toCollection(() -> all));
		// ap.parallelStream()
		// .collect(Collectors.toCollection(() -> all));
		// image.parallelStream()
		// .collect(Collectors.toCollection(() -> all));
		// laboratory.parallelStream()
		// .collect(Collectors.toCollection(() -> all));

		return all;
	}
	
	private String buildWhere(WsParam param, Integer type) {
		String w = param.getWhereFromParam() + " ";
		if(type.intValue() == DocumentCdaType.DISCHARGE.getCode().intValue()){
			w += " por ahora no tiene filtro ";
		}
		if(type.intValue() == DocumentCdaType.REPORT_AP.getCode().intValue()){
			w += " AND typeEpisode != H";
		}
		if(type.intValue() == DocumentCdaType.REPORT_IMAGES.getCode().intValue()){
			w += " AND typeEpisode != H";
		}
		if(type.intValue() == DocumentCdaType.REPORT_LABORATORY.getCode().intValue()){
			w += " AND typeEpisode != H";
		}
		return w;
	}

}
