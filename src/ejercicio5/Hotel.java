package ejercicio5;

public class Hotel {
	private String nombre;
	private String localidad;
	private int habitacionesTotales;
	private int habitacionesOcupadas;
	private int habitacionesReservadas;
	
	public Hotel(String nombre, String localidad, int habitacionesTotales) {	
		setNombre(nombre);
		setLocalidad(localidad);
		setHabitacionesTotales(habitacionesTotales);
	}
	public Hotel(String nombre, String localidad, int habitacionesTotales, int habitacionesOcupadas, int habitacionesReservadas) {
		setNombre(nombre);
		setLocalidad(localidad);
		setHabitacionesTotales(habitacionesTotales);
		setHabitacionesOcupadas(habitacionesOcupadas);
		setHabitacionesReservadas(habitacionesReservadas);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalidad() {
		return localidad;
	}
	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getHabitacionesTotales() {
		return habitacionesTotales;
	}
	private void setHabitacionesTotales(int habitacionesTotales) {
		this.habitacionesTotales = habitacionesTotales;
	}
	public int getHabitacionesOcupadas() {
		return habitacionesOcupadas;
	}
	private void setHabitacionesOcupadas(int habitacionesOcupadas) {
		this.habitacionesOcupadas = habitacionesOcupadas;
	}		
	public int getHabitacionesReservadas() {
		return habitacionesReservadas;
	}
	public void setHabitacionesReservadas(int habitacionesReservadas) {
		this.habitacionesReservadas = habitacionesReservadas;
	}
	@Override
	public String toString() {
		return String.format("​Hotel %s %s [habitaciones=%d, ocupadas=%d,reservadas=%d, libres=%s, disponibles=%d]",
	nombre, localidad, habitacionesTotales, habitacionesOcupadas, habitacionesReservadas, cantidadHabitacionesLibres(), disponibilidad()); 
	}
	public boolean reservarHabitaciones(int cantHabitaciones) {
		if (cantHabitaciones < disponibilidad()) {
			reservar(cantHabitaciones);
			return true;
		}
		else {
			return false;
		}
	}
	private void reservar(int cantHabitaciones) {
		this.habitacionesReservadas += cantHabitaciones;
	}
	public boolean ocuparHabitaciones(int cantHabitaciones, boolean reservado) {
		if (reservado && getHabitacionesReservadas() >= cantHabitaciones) {
			ocuparConReserva(cantHabitaciones);
			return true;
		}
		else if (!reservado && cantHabitaciones <= disponibilidad()) {
			ocuparSinReserva(cantHabitaciones);
			return true;
		}
		else {
			return false;
		}
	}
	private void ocuparConReserva(int cantHabitaciones) {
		this.habitacionesOcupadas += cantHabitaciones;
		this.habitacionesReservadas -= cantHabitaciones;
	}
	private void ocuparSinReserva(int cantHabitaciones) {
		this.habitacionesOcupadas += cantHabitaciones;
	}
	public boolean desocuparHabitaciones(int cantHabitaciones) {
		if (cantHabitaciones <= getHabitacionesOcupadas()) {
			desocupar(cantHabitaciones);
			return true;
		}
		else {
			return false;
		}
	}
	private void desocupar(int cantHabitaciones) {
		this.habitacionesOcupadas -= cantHabitaciones;
	}
	public int cantidadHabitacionesLibres() {
		return getHabitacionesTotales() - getHabitacionesOcupadas();
	}
	public int disponibilidad() {
		return getHabitacionesTotales() - (getHabitacionesReservadas() + getHabitacionesOcupadas());
	}
}
