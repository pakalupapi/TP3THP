package ejercicio1;

public class Persona {
	//Atributos privadoss
	private String nombre;
	private String apellido;
	private String direccion;
	
	//Metodos publicos
	public void completarDatos(String nombre, String apellido, String direccion) {
		setNombre(nombre);
		setApellido(apellido);
		setDireccion(direccion);
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
	public void mostrarPersona() {
		System.out.println("Nombre: "+ this.nombre);
		System.out.println("Apellido: "+ this.apellido);
		System.out.println("Direccion: "+ this.direccion );
	}
	
}
