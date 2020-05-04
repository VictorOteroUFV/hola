package vaadin_archetype_application.JMA1231;

public class Usuario {
	
	public String nombre;
	public String apellidos;
	public String empresa;
	public int telefono;
	public String email;
	public String direccion;
	
	
	
	public Usuario(String nombre, String apellidos, String empresa , int telefono, String email, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.empresa = empresa;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos (String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa (String empresa) {
		this.empresa = empresa;
	}
	
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion (String direccion) {
		this.direccion = direccion;
	}
}
