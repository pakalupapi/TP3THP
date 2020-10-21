package ejercicio2;

public class Cuadrado {
	int lado;

	public void ingresarLado(int lado) {
		setLado(lado);
	}
	public int getLado() {
		return this.lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public int perimetro() {
		int perimetro = this.lado*4;
		return perimetro;
	}
	public int superficie() {
		int superficie=this.lado*this.lado;
		return superficie;
	}
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado +", perimetro()=" + perimetro()
				+ ", superficie()=" + superficie() + "]";
	}
	
}
