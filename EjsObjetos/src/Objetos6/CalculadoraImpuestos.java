package Objetos6;
import javax.swing.JOptionPane;
public class CalculadoraImpuestos {
		
 
	private final double PORCENTAJE_IMPUESTO = 0.15; // Constante
	private double precioFinal;// variable
 
	public CalculadoraImpuestos(double precio) { // Constructor
		precioFinal = precio + precio * PORCENTAJE_IMPUESTO;
	}
 
	public String Dime_PrecioFinal() {// Getter
		return "El precio final del producto es: " + precioFinal;
}
}