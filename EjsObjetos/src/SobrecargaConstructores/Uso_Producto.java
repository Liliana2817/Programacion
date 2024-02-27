package SobrecargaConstructores;

public class Uso_Producto {

	public static void main(String[] args) {
		// Crear instancias de Producto con diferentes constructores
        Producto Prod1 = new Producto("Camiseta", 20.0, 50);
        Producto Prod2 = new Producto("Zapatos", 50.0);
        Producto Prod3 = new Producto("Pantalón");

        // Mostrar información de los productos
        System.out.println("Información del producto 1:");
        System.out.println("Nombre: " + Prod1.getNombre());
        System.out.println("Precio: " + Prod1.getPrecio());
        System.out.println("Cantidad en stock: " + Prod1.getCantidadStock());
        System.out.println();

        System.out.println("Información del producto 2:");
        System.out.println("Nombre: " + Prod2.getNombre());
        System.out.println("Precio: " + Prod2.getPrecio());
        System.out.println("Cantidad en stock: " + Prod2.getCantidadStock());
        System.out.println();

        System.out.println("Información del producto 3:");
        System.out.println("Nombre: " + Prod3.getNombre());
        System.out.println("Precio: " + Prod3.getPrecio());
        System.out.println("Cantidad en stock: " + Prod3.getCantidadStock());

	}

}
