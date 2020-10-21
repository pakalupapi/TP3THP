package ejercicio8;

public class Superheroe {
	private static final int MINIMO=0;
	private static final int MAXIMO=100;
	public String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setFuerza(int fuerza) {
		if (fuerza >= MINIMO && fuerza <= MAXIMO) {
			this.fuerza = fuerza;
		}
		else if (fuerza < MINIMO) {
			this.fuerza = MINIMO;
		}
		else {
			this.fuerza = MAXIMO;
		}
	}
	private void setResistencia(int resistencia) {
		if (resistencia >= MINIMO && resistencia <= MAXIMO) {
			this.resistencia = resistencia;
		}
		else if (resistencia < MINIMO) {
			this.resistencia = MINIMO;
		}
		else {
			this.resistencia = MAXIMO;
		}
	}
	private void setSuperpoderes(int superpoderes) {
		if (superpoderes >= MINIMO && superpoderes <= MAXIMO) {
			this.superpoderes = superpoderes;
		}
		else if (superpoderes < MINIMO) {
			this.superpoderes = MINIMO;
		}
		else {
			this.superpoderes = MAXIMO;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public int getFuerza() {
		return fuerza;
	}
	public int getResistencia() {
		return resistencia;
	}
	public int getSuperpoderes() {
		return superpoderes;
	}
	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	public String competir(Superheroe superheroe) {
		boolean a = getFuerza() > superheroe.getFuerza() && getResistencia() > superheroe.getResistencia() && getSuperpoderes() > superheroe.getSuperpoderes();
		boolean b = getFuerza() > superheroe.getFuerza();
		boolean c = getResistencia() > superheroe.getResistencia();
		boolean d = getSuperpoderes() > superheroe.getSuperpoderes();
		System.out.println(getNombre() + " vs "+ superheroe.getNombre());
		
		return VAR(a, b, c, d);
	}
	public String VAR(boolean a, boolean b, boolean c, boolean d) {
		String resul;
		if (a || (b && c) || (c && d) || (b && d)) {
			resul = "TRIUNFO DE "+ getNombre();
		}
		else if (b || c || d) {
			resul = "DERROTA DE "+ getNombre();
		}
		else {
			resul = "EMPATE";
		}
		return resul;
	}
}
