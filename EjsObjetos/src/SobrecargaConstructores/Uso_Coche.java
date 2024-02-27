package SobrecargaConstructores;

public class Uso_Coche {

	public static void main(String[] args) {
		// Crear instancias de Coche con diferentes constructores
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, "Azul");
        Coche coche2 = new Coche("Ford", "Mustang", "Rojo");
        Coche coche3 = new Coche("Chevrolet", "Camaro");

        // Mostrar información de los coches
        System.out.println("Información del coche 1:");
        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Año: " + coche1.getAño());
        System.out.println("Color: " + coche1.getColor());
        System.out.println();

        System.out.println("Información del coche 2:");
        System.out.println("Marca: " + coche2.getMarca());
        System.out.println("Modelo: " + coche2.getModelo());
        System.out.println("Año: " + coche2.getAño());
        System.out.println("Color: " + coche2.getColor());
        System.out.println();

        System.out.println("Información del coche 3:");
        System.out.println("Marca: " + coche3.getMarca());
        System.out.println("Modelo: " + coche3.getModelo());
        System.out.println("Año: " + coche3.getAño());
        System.out.println("Color: " + coche3.getColor());

	}

}
