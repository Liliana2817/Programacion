package Objetos2;

public class Producto {
 private String nombre;
 private double precio;
 private int stock;
 
		
 public String dime_nombre() {
		
		return "El nombre del producto es " + nombre;
		
	}
	public void establece_nombre() {
		nombre="movil xiaomi";
	}
	
	public String dime_precio() {
		return "El precio del producto es de " + precio + " €";
	}
	public void establece_precio() {
		precio=250.99;
	}
	public String dime_stock() {
		return "El stock del producto es de " + stock;
	}
	public void establece_stock() {
		stock=-100;	
		
		if (stock >= 0) {
			stock = stock;
		} else {
			System.out.println("El stock no puede ser negativo.");
		}
		}
}
