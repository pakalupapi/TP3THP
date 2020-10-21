package ejercicio8;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superheroe super1=new Superheroe("Batman", 90, 70, 0);
		Superheroe super2=new Superheroe("Superman", 95, 60, 70);
		System.out.println(super1);
		System.out.println(super1.competir(super2));
		System.out.println(super2.competir(super1));
	}

}
