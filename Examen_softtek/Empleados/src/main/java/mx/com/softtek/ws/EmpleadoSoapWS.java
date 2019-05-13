package mx.com.softtek.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.com.softtek.empleados.EmpleadoRequest;
import mx.com.softtek.empleados.EmpleadoResponse;
import mx.com.softtek.service.EmpleadoService;

@Endpoint
public class EmpleadoSoapWS {
	private static final String NAMESPACE_URI = "http://softtek.com.mx/empleados";

	@Autowired
	EmpleadoService empleadoService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "empleadoRequest")
	@ResponsePayload
	public EmpleadoResponse obtenerAreas(@RequestPayload EmpleadoRequest empleadoRequest){
		EmpleadoResponse response = new EmpleadoResponse();
		try {
		empleadoService.guardarEmpleados(empleadoRequest);
		response.setAviso("Se ha guardado correctamente");
		}
		catch(Exception e) {
			response.setAviso("Algo ha fallado");
		}
		return response;
		
	}
}
