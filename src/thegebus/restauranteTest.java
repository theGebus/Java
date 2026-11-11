package thegebus;

public class restauranteTest {

	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante();
		Restaurante rest2 = new Restaurante();
		
		rest1.direccion = "Sanjuan";
		rest2.nombre = "Mechomera";
		
		System.out.println("Restaurane 1  "+ rest1.direccion);
		System.out.println("Restaurane 2  "+ rest2.nombre);
	}

}
