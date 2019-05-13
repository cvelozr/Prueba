package mx.com.softtek.entity.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.softtek.entity.Contrato;

public class ContratoRowMapper implements RowMapper<Contrato>{

	@Override
	public Contrato mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contrato contrato = new Contrato();
		contrato.setIdContrato(rs.getInt("ID_CONTRATO"));
		contrato.setNombre(rs.getString("NOMBRE"));
		return contrato;
	}

}
