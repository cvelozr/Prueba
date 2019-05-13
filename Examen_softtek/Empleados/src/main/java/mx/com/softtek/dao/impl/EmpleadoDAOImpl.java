package mx.com.softtek.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mx.com.softtek.dao.EmpleadosDAO;
import mx.com.softtek.entity.Empleado;
import mx.com.softtek.entity.EmpleadoArea;

@Transactional
@Repository
public class EmpleadoDAOImpl implements EmpleadosDAO {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public Empleado obtenerEmpleadoPorId(int id_empleado) throws SQLException {
		String sql = "select * from empleado where id_empleado = ?";
		RowMapper<Empleado> rowMapper = new BeanPropertyRowMapper<Empleado>(Empleado.class);
		Empleado empleado = jdbcTemplate.queryForObject(sql, rowMapper, id_empleado);
		return empleado;
	}

	@Override
	public List<EmpleadoArea> obtenerEmpleadosPorArea(String cveArea) throws SQLException {
		List<EmpleadoArea> empleadosArea = new ArrayList<>();
		String sql = "select * from empleado_area where cve_area = ?";
		//RowMapper<EmpleadoArea> rowMapper = new BeanPropertyRowMapper<EmpleadoArea>(EmpleadoArea.class);
		//List<EmpleadoArea> empleadoArea = (List<EmpleadoArea>) jdbcTemplate.queryForObject(sql, rowMapper, cveArea);
		List<Map<String, Object>> empleados = jdbcTemplate.queryForList(sql,cveArea);
	       for (Map rs : empleados) {
	   		EmpleadoArea empleadoArea = new EmpleadoArea();
			empleadoArea.setCve_area(String.valueOf(rs.get("CVE_AREA")));
			empleadoArea.setIdEmpleado(Integer.parseInt(String.valueOf(rs.get("ID_EMPLEADO"))));
	    	   empleadosArea.add(empleadoArea);
	        }
		return empleadosArea;
	}

	@Override
	public int guardarEmpleado(Empleado empleado) {
	      String sql = "INSERT INTO EMPLEADO " +
	              "(CVE_EMPLEADO, NOMBRE, PATERNO, MATERNO) VALUES (?, ?, ?, ?)";
	      KeyHolder keyHolder = new GeneratedKeyHolder();
	      jdbcTemplate.update( new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps =
		                con.prepareStatement(sql, new String[] {"id"});
				ps.setString(1, empleado.getCveEmpleado());
				ps.setString(2, empleado.getNombre());
				ps.setString(3, empleado.getPaterno());
				ps.setString(4, empleado.getMaterno());
				return ps;
			}
		},keyHolder);
	      return keyHolder.getKey().intValue();
	}

	@Override
	public void guardaEmpleadoArea(EmpleadoArea empleadoArea) {
        String sql = "INSERT INTO EMPLEADO_AREA " +
                "(ID_EMPLEADO, CVE_AREA) VALUES (?, ?)";
            
            jdbcTemplate.update(sql, new Object[] { empleadoArea.getIdEmpleado(),
                    empleadoArea.getCve_area()
            });
		
	}

}
