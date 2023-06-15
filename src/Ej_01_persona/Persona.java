package Ej_01_persona;

public class Persona {
	private String nombre,apellido;
	private DNI dni;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public DNI getDni() {
		return dni;
	}

	public void setDni(DNI dni) {
		this.dni = dni;
	}
}
