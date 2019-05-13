package mx.com.softtek.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.com.softtek.entity.Area;
import mx.com.softtek.service.AreaService;

@Controller
@RequestMapping("catalog")
public class CatalogoRestWs {

	@Autowired
	AreaService areaService;
	@GetMapping("/areas")
	public ResponseEntity<List<Area>> getEmpleadById() throws Exception {
		List<Area> areas = areaService.obtenerAreas();
		return new ResponseEntity<List<Area>>(areas, HttpStatus.OK);
	}
}
