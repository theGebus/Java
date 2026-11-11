package gebus;

public class platoTest {

	public static void main(String[] args) {
		
		                          Plato platoA = new Plato();
		
		System.out.println("======================== Plato A Agregado ======================== ");
		System.out.println(" Nombre del Plato:  "+ platoA.nombre);
		System.out.println("Tipo de Plato:      "+ platoA.tipo);
		System.out.println("Precio:             "+ platoA.precio + "$");
		System.out.println("disponible          "+ platoA.disponible);
		
		platoA.nombre = "La Gran Cena ";
		platoA.tipo = "Plato Fuerte";
		platoA.precio = (float) (25.50);
		platoA.disponible = true;
		
		System.out.println("======================== Plato A Asignado ======================== ");
		System.out.println(" Nombre del Plato:  "+ platoA.nombre);
		System.out.println("Tipo de Plato:      "+ platoA.tipo);
		System.out.println("Precio:             "+ platoA.precio + "$");
		System.out.println("disponible          "+ platoA.disponible);
		
		
		                           Plato platoB = new Plato();
		
		System.out.println("======================== Plato B Agregado ======================== ");
		System.out.println("Nombre del Plato:  "+ platoB.nombre);
		System.out.println("Tipo de Plato:     "+ platoB.tipo);
		System.out.println("Precio:            "+ platoB.precio + "$");
		System.out.println("disponible         "+ platoB.disponible);
		
		platoB.nombre = "Perla Negra ";
		platoB.tipo = "Postre";
		platoB.precio = (float) (100);
		platoB.disponible = true;
		
		System.out.println("======================== Plato B Asignado ======================== ");
		System.out.println(" Nombre del Plato:  "+ platoB.nombre);
		System.out.println("Tipo de Plato:      "+ platoB.tipo);
		System.out.println("Precio:             "+ platoB.precio + "$");
		System.out.println("disponible          "+ platoB.disponible);
		
		                          Plato platoC = new Plato();
        System.out.println("======================== Plato C Agregado ======================== ");
        System.out.println("Nombre del Plato:  "+ platoC.nombre);
        System.out.println("Tipo de Plato:     "+ platoC.tipo);
		System.out.println("Precio:            "+ platoC.precio + "$");
		System.out.println("disponible         "+ platoC.disponible);
		                  		
		                  		platoC.nombre = "La Ultima Lagrima ";
		                  		platoC.tipo = "Entrada";
		                  		platoC.precio = (float) (599.99);
		                  		platoC.disponible = true;
		                  		
		System.out.println("======================== Plato C Asignado ======================== ");
		System.out.println(" Nombre del Plato:  "+ platoC.nombre);
		System.out.println("Tipo de Plato:      "+ platoC.tipo);
		System.out.println("Precio:             "+ platoC.precio + "$");
		System.out.println("disponible          "+ platoC.disponible);

	}

}
