package mx.com.softtek.entity;

public class Empleado {

	private Integer idEmpleado;
	private String cveEmpleado;
	private String nombre;
	private String paterno;
	private String materno;
	private Integer idContrato;
	
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getCveEmpleado() {
		return cveEmpleado;
	}
	public void setCveEmpleado(String cveEmpleado) {
		this.cveEmpleado = cveEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public Integer getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(Integer idContrato) {
		this.idContrato = idContrato;
	}
	
	
}
