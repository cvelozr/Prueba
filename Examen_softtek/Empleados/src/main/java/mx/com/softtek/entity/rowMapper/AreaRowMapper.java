package mx.com.softtek.entity.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.softtek.entity.Area;

public class AreaRowMapper implements RowMapper<Area>{

	@Override
	public Area mapRow(ResultSet rs, int rowNum) throws SQLException {
		Area area = new Area();
		area.setCveArea(rs.getString("CVE_AREA"));
		area.setDescripcion(rs.getString("DESCRIPCION"));
		return area;
	}

}
