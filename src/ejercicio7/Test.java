package ejercicio7;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raton raton=new Raton(100);
		Gato gato=new Gato(100);
		System.out.println(raton +""+ gato);
		
		System.out.println("Distancia de 10 mts");
		corrida(raton, gato, 10);		
		System.out.println("Distancia de 50 mts");
		corrida(raton, gato, 50);
		System.out.println("Distancia de 80 mts");
		corrida(raton, gato, 80);
		
	}
	public static void corrida(Raton raton, Gato gato, int distancia) {
		if (gato.alcanzar(raton, distancia)) {
			System.out.println("El raton ha sido capturado.");
		}
		else {
			System.out.println("El raton es libre.");
		}
	}
}
