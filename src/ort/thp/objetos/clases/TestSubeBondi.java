package ort.thp.objetos.clases;

public class TestSubeBondi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colectivo bondi1=new Colectivo(99, 112);
		Sube sube1=new Sube();
		
		sube1.cargarSaldo(100);
		System.out.println(sube1);
		cargarSube(sube1, 50);
		System.out.println(sube1);
		bondi1.cobrarViaje(sube1);
		System.out.println(bondi1);
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
