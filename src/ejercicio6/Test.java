package ejercicio6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil auto1=new Automovil("Ford", "Fiesta", "ABC123", 40);
		System.out.println(auto1);
		
		auto1.setRendimientoPorLitro(10);
		System.out.println(auto1);
		
		auto1.cargarCombustible(20);
		System.out.println(auto1);
		
		System.out.println("Intente recorrer 180 kms y recorri "+ auto1.viajar(180)+ " kms.");
		System.out.println(auto1);
		
		System.out.println("Intente recorrer 50 kms y recorri "+ auto1.viajar(50)+ " kms.");
		System.out.println(auto1);
	}

}
