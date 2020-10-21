package ejercicio2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cuadrado=new Cuadrado();
		
		cuadrado.ingresarLado(10);
		System.out.println(cuadrado);
		
		cuadrado.ingresarLado(50);
		System.out.println("Cambio el tamaño del cuadrado a "+ cuadrado.getLado()+ " por lado.");
		System.out.println(cuadrado);
	}

}
