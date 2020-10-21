package ort.thp.objetos.clases;

public class Persona {
	//Atributos privadoss
	private String nombre;
	private String apellido;
	private String dni;
	private boolean esencial;
	
	//Metodos publicos
	public Persona(String nombre, String apellido, String dni, boolean esencial) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setEsencial(esencial);
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public boolean isEsencial() {
		return esencial;
	}
	public void setEsencial(boolean esencial) {
		this.esencial = esencial;
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
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", escencial=" + esencial
				+ "]";
	}
	public void mostrarPersona() {
		System.out.println("Nombre: "+ getNombre());
		System.out.println("Apellido: "+ getApellido());
		System.out.println("DNI: "+ getDni());
	}
	
}
