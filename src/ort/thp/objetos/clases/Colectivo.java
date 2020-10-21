package ort.thp.objetos.clases;

public class Colectivo {
	private final static double PRECIO = 25.0;
	private int linea;
	private int interno;
	private int cantViajes;
	private double recaudacion;
	
	public Colectivo(int linea, int interno) {
		setLinea(linea);
		setInterno(interno);
		setCantViajes(0);
		setRecaudacion(0);
	}
	public int getLinea() {
		return linea;
	}
	public void setLinea(int linea) {
		if (linea > 0) {
			this.linea = linea;
		}
		else {
			this.linea = 0;
		}	
	}
	public int getInterno() {
		return interno;
	}
	public void setInterno(int interno) {
		this.interno = interno;
	}
	public int getCantViajes() {
		return cantViajes;
	}
	public void setCantViajes(int cantViajes) {
		this.cantViajes = cantViajes;
	}
	public double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	@Override
	public String toString() {
		return "Colectivo [linea=" + linea + ", interno=" + interno + ", cantViajes=" + cantViajes + ", recaudacion="
				+ recaudacion + "]";
	}
	public void cobrarViaje(Sube sube) {
		if(sube.estaHabilitada()) {
			if (sube.consumirSaldo(PRECIO)) {
//				this.recaudacion += PRECIO;
				setRecaudacion(getRecaudacion() + PRECIO);
				this.cantViajes ++;
				System.out.println("Ok. Saldo restante: "+ sube.getSaldo());
			}
			else {
				System.out.println("Saldo insuficiente");
			}
		}
	}
}
