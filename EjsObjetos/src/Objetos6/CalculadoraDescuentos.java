package Objetos6;

import javax.swing.JOptionPane;

public class CalculadoraDescuentos {
	
public static final double PorcentajeDescuento = 10;
 
public static void Calcular(double PrecioUnitario, int Cantidad) {
	double PrecioTotal;
	if(Cantidad > 5) {
		double Descuento = (PrecioUnitario *  PorcentajeDescuento / 100) * Cantidad;
	      PrecioTotal = (PrecioUnitario + Cantidad) - Descuento;
		//Muestra el resultado
	      String Mensaje = String.format("Precio total con descuento: %.2f", PrecioTotal);
	      JOptionPane.showMessageDialog(null,Mensaje);		
	} else {
		//Muestra el precio total sin descuento
		PrecioTotal = PrecioUnitario * Cantidad;
		String Mensaje = String.format("Precio total sin con descuento: %.2f", PrecioTotal);
		JOptionPane.showMessageDialog(null,Mensaje);	
	}
}
}
