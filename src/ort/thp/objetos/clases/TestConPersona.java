package ort.thp.objetos.clases;

public class TestConPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colectivo bondi1=new Colectivo(99, 112);
		Sube miSube=new Sube();
		Persona persona=new Persona("Osvaldo", "Lucero", "41265239", false);
		
		cargarSube(miSube, 100);
		bondi1.cobrarViaje(miSube);
		System.out.println(miSube);
		
		miSube.setPersona(persona);
		System.out.println(miSube);
	}
	public static void cargarSube(Sube sube, double importe) {
		if (sube.cargarSaldo(importe)) {
			System.out.println("OK");
		}
		else {
			System.out.println(":(");
		}
	}
}
