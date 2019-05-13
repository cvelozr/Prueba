package mx.com.softtek.entity.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.softtek.entity.EmpleadoArea;

public class EmpleadoAreaRowMapper implements RowMapper<EmpleadoArea>{

	@Override
	public EmpleadoArea mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmpleadoArea empleadoArea = new EmpleadoArea();
		empleadoArea.setCve_area(rs.getString("CVE_AREA"));
		empleadoArea.setIdEmpleado(rs.getInt("ID_EMPLEADO"));
		return empleadoArea;
	}



}
