package mx.com.softtek.entity.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.softtek.entity.Empleado;

public class EmpleadoRowMapper implements RowMapper<Empleado>{

	@Override
	public Empleado mapRow(ResultSet rs, int rowNum) throws SQLException {
		Empleado empleado = new Empleado();
		empleado.setIdEmpleado(rs.getInt("ID_EMPLEADO"));
		empleado.setCveEmpleado(rs.getString("CVE_EMPLEADO"));
		empleado.setNombre(rs.getString("NOMBRE"));
		empleado.setPaterno(rs.getString("PATERNO"));
		empleado.setMaterno(rs.getString("MATERNO"));
		empleado.setIdContrato(rs.getInt("ID_CONTRATO"));
		return empleado;
	}

}
