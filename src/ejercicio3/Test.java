package ejercicio3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarjetaDeCredito tarjeta1=new tarjetaDeCredito("4145414122221111", "Juan Perez", 10000);
		System.out.println(tarjeta1);
		
		tarjeta1.realizarCompra(4000);
		System.out.println(tarjeta1);
		
		tarjeta1.actualizarLimite(3000);
		tarjeta1.realizarCompra(4000);
		System.out.println(tarjeta1);
	}

}
