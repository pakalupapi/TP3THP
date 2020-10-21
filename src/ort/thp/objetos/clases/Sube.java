package ort.thp.objetos.clases;

public class Sube {
	private double limiteNegativo;
	private double limitePositivo;
	private String numeroTarjeta;
	private double saldo;
	private Persona persona;
	
	
	public Sube() {
		setLimitePositivo(600);
		setLimiteNegativo(-100);
		setNumeroTarjeta("");
		setSaldo(0);
	}
	public Sube(double limiteNegativo, double limitePositivo, String numeroTarjeta, double saldo) {
		setLimitePositivo(limitePositivo);
		setLimiteNegativo(limiteNegativo);
		setNumeroTarjeta(numeroTarjeta);
		setSaldo(saldo);
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public double getLimiteNegativo() {
		return limiteNegativo;
	}
	public void setLimiteNegativo(double limiteNegativo) {
		this.limiteNegativo = limiteNegativo;
	}
	public double getLimitePositivo() {
		return limitePositivo;
	}
	public void setLimitePositivo(double limitePositivo) {
		this.limitePositivo = limitePositivo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		if (numeroTarjeta.length()==16) {
			this.numeroTarjeta = numeroTarjeta;
		}
		else {
			this.numeroTarjeta = "";
		}
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	@Override
	public String toString() {
		return "Sube [limiteNegativo=" + limiteNegativo + ", limitePositivo=" + limitePositivo + ", numeroTarjeta="
				+ numeroTarjeta + ", saldo=" + saldo + ", persona=" + persona + "]";
	}
	public boolean consumirSaldo(double importe) {
		boolean resul = false;
		if (this.saldo-importe>=limiteNegativo) {
			this.saldo-=importe;
			resul=true;
		}
		return resul;
	}
	public void usarSube(double importe) {
		//El hecho que mencionemos a consumirSaldo() lo hace funcionar. Por lo tanto, 
		//el metodo usarSube() incluye las funcionalidad de consumirSaldo().
		if(consumirSaldo(importe)) {
			System.out.println("OK, tu saldo es $"+ getSaldo());
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	public boolean cargarSaldo(double importe) {
		boolean resul = false;
		if ((saldo+importe)<=limitePositivo) {
			this.saldo+=importe;
			resul = true;
		}
		
		return resul;
	}
	public void confirmaCarga(double importe) {
		if (cargarSaldo(importe)) {
			System.out.println("OK, ahora tu saldo es de: $"+this.saldo);
		}
		else {
			System.out.println("El maximo de carga es de $600, por favor vuelva a intentarlo");
		}
	}
	public boolean estaHabilitada() {
		boolean ok = false;
		if (getPersona() != null) {
			ok = persona.isEsencial();
		}
		return ok;
	}
}
