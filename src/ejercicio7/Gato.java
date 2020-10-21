package ejercicio7;

public class Gato {
	int energia;
	
	public Gato(int energia) {
		setEnergia(energia);
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public int getEnergia() {
		return energia; 
	}
	@Override
	public String toString() {
		return "Gato [energia=" + energia + "]";
	}
	public boolean alcanzar(Raton raton, int distancia) {
		boolean alcanza = false;
		if ((raton.getEnergia() / 2) >= distancia) {
			alcanza = true;
		}
		return alcanza;
	}	
}
