package ejercicio1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1=new Persona();
		Persona persona2=new Persona();
		
		persona1.completarDatos("Diego", "Diaz", "Yatay 240");
		persona2.completarDatos("Pablo", "Gomez", "Av. Libertador 6796");
		
		System.out.println(persona1);
		persona1.mostrarPersona();
		
		System.out.println(persona2);
		persona2.mostrarPersona();
		
	}

}
