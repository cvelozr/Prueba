package mx.com.softtek.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import mx.com.softtek.dao.EmpleadosDAO;
import mx.com.softtek.empleados.EmpleadoRequest;
import mx.com.softtek.entity.Empleado;
import mx.com.softtek.entity.EmpleadoArea;
import mx.com.softtek.service.EmpleadoService;

@Service ("EmpleadoService")
@Scope
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	EmpleadosDAO empleadosDao;
	@Override
	public Empleado obtenerEmpleadoPorId(int id_empleado) throws SQLException {
		return empleadosDao.obtenerEmpleadoPorId(id_empleado);
	}

	@Override
	public List<Empleado> obtenerEmpleadosPorArea(String cveArea) throws SQLException {
		List<Empleado> empleadosPorArea = new ArrayList<Empleado>();
		List<EmpleadoArea> empleadosArea = empleadosDao.obtenerEmpleadosPorArea(cveArea);
		if(empleadosArea!=null && !empleadosArea.isEmpty()) {
			for(EmpleadoArea empleados: empleadosArea) {
				empleadosPorArea.add(empleadosDao.obtenerEmpleadoPorId(empleados.getIdEmpleado()));
			}
		}
		return empleadosPorArea;
	}

	@Override
	public void guardarEmpleados(EmpleadoRequest empleadoRequest) {
		Empleado empleado = new Empleado();
		EmpleadoArea empleadoArea = new EmpleadoArea();
		empleado.setCveEmpleado(empleadoRequest.getCveEmpleado());
		empleado.setNombre(empleadoRequest.getNombre());
		empleado.setPaterno(empleadoRequest.getPaterno());
		empleado.setMaterno(empleadoRequest.getMaterno());
		int key = empleadosDao.guardarEmpleado(empleado);
		empleadoArea.setCve_area(empleadoRequest.getCveArea());
		empleadoArea.setIdEmpleado(key);
		empleadosDao.guardaEmpleadoArea(empleadoArea);
	}

}
