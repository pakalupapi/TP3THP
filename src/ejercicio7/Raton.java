package ejercicio7;

public class Raton {
	int energia;
	
	public Raton(int energia) {
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
		return "Raton [energia=" + energia + "]";
	}
}
