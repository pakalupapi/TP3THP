package ejercicio3;

public class tarjetaDeCredito {
	private double limiteDeCompra;
	private String numero;
	private String titular;
	private double acumuladoActual;
	
	public tarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		setNumero(numero);
		setTitular(titular);
		setLimiteDeCompra(limiteDeCompra);
		this.acumuladoActual = 0;
	}
	
	public void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getAcumuladoActual() {
		return acumuladoActual;
	}
	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}
	@Override
	public String toString() {
		return "tarjetaDeCredito [limiteDeCompra=" + limiteDeCompra + ", numero=" + numero + ", titular=" + titular
				+ ", acumuladoActual=" + acumuladoActual + "]";
	}
	public double montoDisponible(double acumuladoActual) {
		double montoDisponible;
		montoDisponible = this.limiteDeCompra - acumuladoActual;
		if (montoDisponible > 0) {
			return montoDisponible;
		}
		else {
			return 0.0;
		}
	}
	private boolean compraPosible(double monto) {
		if (montoDisponible(this.acumuladoActual) > monto) {
			return true;
		}
		else {
			return false;
		}
	}
	public void actualizarLimite(double nuevoLimite) {
		this.limiteDeCompra = nuevoLimite;
	}
	private void acumularGastoActual(double monto) {
		this.acumuladoActual += monto;
	}
	public boolean realizarCompra(double monto) {
		boolean resul = compraPosible(monto);
			if (resul) {
				acumularGastoActual(monto);
			}
		return resul;
	}
}
