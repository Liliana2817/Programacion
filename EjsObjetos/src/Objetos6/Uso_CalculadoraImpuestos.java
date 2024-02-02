package Objetos6;

import javax.swing.JOptionPane;

public class Uso_CalculadoraImpuestos {

	public static void main(String[] args) {
		String precioPorcentaje = JOptionPane.showInputDialog("El precio del producto es:");
		double precio = Double.parseDouble(precioPorcentaje);
		CalculadoraImpuestos calculadora = new CalculadoraImpuestos(precio);
		JOptionPane.showMessageDialog(null, calculadora.Dime_PrecioFinal());

	}

}
