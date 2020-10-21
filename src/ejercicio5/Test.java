package ejercicio5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hilton=new Hotel("Hilton", "CABA", 200);
		Hotel astoria=new Hotel("Astoria", "MDQ", 150, 100, 10);
		
		hilton.ocuparHabitaciones(201, false);
		System.out.println(hilton);
		
		hilton.ocuparHabitaciones(30, false);
		System.out.println(hilton.disponibilidad());
		hilton.reservarHabitaciones(50);
		System.out.println(hilton.disponibilidad());
		
		hilton.desocuparHabitaciones(200);
		hilton.ocuparHabitaciones(30, true);
		System.out.println(hilton);
		hilton.ocuparHabitaciones(30, true);
		
		hilton.desocuparHabitaciones(40);
		
		System.out.println(hilton);
		
		System.out.println("Estado inicial del hotel Astoria (MDQ)");
		System.out.println(astoria);	
		
		astoria.ocuparHabitaciones(201, false);
		System.out.println(astoria);
		
		astoria.ocuparHabitaciones(30, false);
		System.out.println(astoria);
		astoria.reservarHabitaciones(50);
		System.out.println(astoria);
		
		astoria.desocuparHabitaciones(200);
		System.out.println(astoria);
		astoria.ocuparHabitaciones(30, true);
		System.out.println(astoria);
		astoria.ocuparHabitaciones(30, true);
		System.out.println(astoria);
		astoria.desocuparHabitaciones(40);
		System.out.println(astoria);
	}

}
