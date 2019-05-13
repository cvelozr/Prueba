package mx.com.softtek.service;

import java.sql.SQLException;
import java.util.List;

import mx.com.softtek.empleados.EmpleadoRequest;
import mx.com.softtek.entity.Empleado;

public interface EmpleadoService {

	Empleado obtenerEmpleadoPorId(int id_empleado) throws SQLException;
	List<Empleado> obtenerEmpleadosPorArea(String cveArea) throws SQLException;
	void guardarEmpleados(EmpleadoRequest empleadoRequest);
}
