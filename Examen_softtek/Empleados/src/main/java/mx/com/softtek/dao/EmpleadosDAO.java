package mx.com.softtek.dao;

import java.sql.SQLException;
import java.util.List;

import mx.com.softtek.entity.Empleado;
import mx.com.softtek.entity.EmpleadoArea;

public interface EmpleadosDAO {

	Empleado obtenerEmpleadoPorId(int id_empleado) throws SQLException;
	List<EmpleadoArea> obtenerEmpleadosPorArea(String cveArea) throws SQLException;
	int guardarEmpleado(Empleado empleado);
	void guardaEmpleadoArea(EmpleadoArea empleadoArea);
}
