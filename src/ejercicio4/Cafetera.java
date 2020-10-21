package ejercicio4;

public class Cafetera {
	private final int MAXIMO=2000;
	private int capacidadMaxima;//medida en mililitros.
	private int cantidadActual;//medida en mililitros.
	
	public Cafetera(int capacidadMax) {
		setCapacidadMaxima(capacidadMax);
		setCantidadActual(0);
	}
	public Cafetera(int capacidadMax, int cantidadActual) {
		/*Constructor con la capacidad máxima y la cantidad actual. Si la cantidad
		actual es mayor que la capacidad máxima de la cafetera, la ajustará al
		máximo.*/
		if (cantidadActual > capacidadMax) {
			setCapacidadMaxima(MAXIMO);
		}
		else{
			setCapacidadMaxima(capacidadMax);
		}
		setCantidadActual(cantidadActual);
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	private void setCapacidadMaxima(int capacidadMaxima) {
		if (capacidadMaxima >= 250) {
			this.capacidadMaxima = capacidadMaxima;
		}
		else{
			this.capacidadMaxima = 250;
		}
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	private void setCantidadActual(int cantidadActual) {
		boolean cantidadValida = cantidadActual >= 0 && cantidadActual <= this.capacidadMaxima;
		
		if (cantidadValida) {
			this.cantidadActual = cantidadActual;
		}
		else if (cantidadActual < 0) {
			this.cantidadActual = 0;
		}
		else {
			this.cantidadActual = this.capacidadMaxima;
		}
	}
	
	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	public void llenar() {
		setCantidadActual(this.capacidadMaxima);
	}
	public void vaciar() {
		setCantidadActual(0);
	}
	public int servirTaza(int cantidadCafe) {
		/*simula la acción de servir una taza con la capacidad indicada
		por parámetro. Si la cantidad actual de café no alcanza para llenar la taza, se
		sirve lo que haya.*/
		int taza;
		
		if (getCantidadActual() > cantidadCafe) {
			this.cantidadActual -= cantidadCafe;
			taza = cantidadCafe;
		}
		else {
			taza = getCantidadActual();
			this.cantidadActual = 0;
		}
		
		return taza;
	}
	public int agregarCafe(int cantidadCafe) {
		/*Añade a la cafetera la cantidad de café indicada, en el caso
		de ser posible. Devuelve la cantidad sobrante.*/
		boolean cantidadValida = (cantidadCafe + getCantidadActual()) < getCapacidadMaxima();
		
		while(!cantidadValida) {
			if (cantidadCafe + getCantidadActual() > getCapacidadMaxima()) {
				System.out.println("La cantidad indicada excede el limite de la máquina.");
			}
			else if (cantidadCafe > 0) {
				System.out.println("Por favor, ingrese una cantidad mayor o igual a cero");
			}
		}
		return getCantidadActual() + cantidadCafe;
	}
}
