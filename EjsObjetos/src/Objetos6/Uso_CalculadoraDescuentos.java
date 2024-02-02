package Objetos6;

import javax.swing.JOptionPane;

public class Uso_CalculadoraDescuentos {

	public static void main(String[] args) {
		// Obtiene el precio y la cantidad
		String inputPrecioUnitario = JOptionPane.showInputDialog("Ingrese el precio del producto: ");
        String  inputCantidad = JOptionPane.showInputDialog("Ingresa la cantidad de unidades: ");
	
        //convertir las entradas
        double PrecioUnitario = Double.parseDouble(inputPrecioUnitario);
        int Cantidad = Integer.parseInt(inputCantidad);
        //crea y llama metodo de calculo
        CalculadoraDescuentos.Calcular(PrecioUnitario, Cantidad);
	}

}
