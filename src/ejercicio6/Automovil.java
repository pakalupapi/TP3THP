package ejercicio6;

public class Automovil {
	String marca;
	String modelo;
	String patente;
	double capacidadTanque;
	double cantidadCombustible;
	double rendimientoPorLitro;
	
	public Automovil() {
		
	}
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		setMarca(marca);
		setModelo(modelo);
		setPatente(patente);
		setCapacidadTanque(capacidadTanque);
		setCantidadCombustible(0);
	}
	
	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public double getCapacidadTanque() {
		return capacidadTanque;
	}

	private void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	public double getCantidadCombustible() {
		return cantidadCombustible;
	}

	private void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}

	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}

	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", capacidadTanque="
				+ capacidadTanque + ", cantidadCombustible=" + cantidadCombustible + ", rendimientoPorLitro="
				+ rendimientoPorLitro + ", espacioDisponible()=" + espacioDisponible() + ", pocoCombustible()="
				+ pocoCombustible() + "]";
	}
	public double viajar(double kms) {
		double kmsRecorridos;
		if ((kms / getRendimientoPorLitro()) <= getCantidadCombustible()) {
			consumirCombustible(kms);
			kmsRecorridos = kms;
		}
		else {
			kmsRecorridos = getCantidadCombustible() * getRendimientoPorLitro();
			consumirCombustible(kmsRecorridos);
		}
		return kmsRecorridos;
	}
	private double consumirCombustible(double kms) {
		double litrosConsumidos = kms / getRendimientoPorLitro();
		this.cantidadCombustible -=  litrosConsumidos;
		return litrosConsumidos;
	}
	public boolean cargarCombustible(double litros) {
		boolean cargaEfectiva = litros <= espacioDisponible() && litros > 0; 
		if (cargaEfectiva) {
			this.cantidadCombustible += litros;
		}
		return cargaEfectiva;
	}
	private double espacioDisponible() {
		return getCapacidadTanque() - getCantidadCombustible();
	}
	public boolean pocoCombustible() {
		double porcentajeCombustible = (getCantidadCombustible() * 100) / getCapacidadTanque();
		boolean reserva = porcentajeCombustible <= 15.0;
		return reserva;
	}
}
