package mx.com.softtek.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.softtek.entity.Empleado;
import mx.com.softtek.service.EmpleadoService;

@Controller
@RequestMapping("recursos")
public class EmpleadoRestWs {

	@Autowired
	EmpleadoService empleadosService;
	
	/*@GetMapping("empleado/{id}")
	public ResponseEntity<Empleado> getEmpleadById(@PathVariable("id") Integer id) {
		Empleado empleado = empleadosService.obtenerEmpleadoPorId(id);
		return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
	}*/
	
	@GetMapping("empleados/{cveArea}")
	public ResponseEntity<List<Empleado>> getEmpleadById(@PathVariable("cveArea") String cveArea) throws Exception {
		List<Empleado> empleados = empleadosService.obtenerEmpleadosPorArea(cveArea);
		return new ResponseEntity<List<Empleado>>(empleados, HttpStatus.OK);
	}
}
