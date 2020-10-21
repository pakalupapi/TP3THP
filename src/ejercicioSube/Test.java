package ejercicioSube;
import ort.thp.objetos.clases.Sube;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sube sube=new Sube();
		Sube sube2=new Sube(-100, 600, "", 0);
		//Sube sube3=new Sube("");
		System.out.println(sube);
		System.out.println(sube2);
		sube.setNumeroTarjeta("1234");
		sube.setSaldo(10.0);
		System.out.println(sube.getSaldo());
		System.out.println(sube);
	}

}
