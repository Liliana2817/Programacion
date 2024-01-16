package Objetos2;

public class Uso_Producto {

	public static void main(String[] args) {
		Producto movil = new Producto();
		movil.establece_nombre();
		System.out.println(movil.dime_nombre());
		
		movil.establece_precio();
		System.out.println(movil.dime_precio());
		
		movil.establece_stock();
		System.out.println(movil.dime_stock());
 

	}

}
