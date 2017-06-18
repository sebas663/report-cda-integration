package org.fleni.cda.externalreport.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.fleni.cda.externalreport.dto.CdaContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author sebastian
 *
 */
@Repository
public class CdaEpicrisisRepository {
	/**
	 * 
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<CdaContainer> findAsll(String table, String where) {
		List<CdaContainer> l = null;
		String sql = "select id, externalReportType, reportId, reportDate, reportVersion, " 
		           + "reportOriginalId, nhc, episodeNumber, typeEpisode, creationDate, "
		           + "messageJsonData, messageCdaData "
		           + "from " + table + " "
		           + "where " + where + " "
				   + "order by reportDate desc";

		l = jdbcTemplate.query(sql, new CdaContainerRowMapper());
		
		return l;
	}
	/**
	 * 
	 * @author sebastian
	 *
	 */
	private static final class CdaContainerRowMapper implements RowMapper<CdaContainer> {
		/*
		 * (non-Javadoc)
		 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
		 */
		@Override
		public CdaContainer mapRow(ResultSet rs, int rowNum) throws SQLException {
			CdaContainer c = new CdaContainer();
			c.setId(rs.getLong(0));
			c.setExternalReportTypeID(rs.getLong(1));
			c.setReportId(rs.getString(2));
			c.setReportDate(rs.getDate(3));
			c.setReportVersion(rs.getLong(4));
			c.setReportOriginalId(rs.getString(5));
			c.setNhc(rs.getString(6));
			c.setEpisodeNumber(rs.getString(7));
			c.setTypeEpisode(rs.getString(8));
			c.setCreationDate(rs.getDate(9));
			c.setMessageJsonData(rs.getBytes(10));
			c.setMessageCdaData(rs.getBytes(11));
			return c;
		}
	}

}
