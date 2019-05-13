package mx.com.softtek.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.softtek.dao.AreaDAO;
import mx.com.softtek.entity.Area;
@Repository
public class AreaDAOImpl implements AreaDAO {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Area> obtenerAreas() {
		List<Area> areas = new ArrayList<>();
		String sql = "select * from area";
		List<Map<String, Object>> areasResult = jdbcTemplate.queryForList(sql);
	       for (Map rs : areasResult) {
	    	   Area area = new Area();
				area.setCveArea(String.valueOf(rs.get("CVE_AREA")));
				area.setDescripcion(String.valueOf(rs.get("DESCRIPCION")));
		    	areas.add(area);
	        }
		return areas;
	}

}
