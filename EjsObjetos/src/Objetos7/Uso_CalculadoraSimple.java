package Objetos7;

import javax.swing.JOptionPane;

public class Uso_CalculadoraSimple {

	public static void main(String[] args) {
		// Obtener los números del usuario.
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número:"));
	// Realiza las operaciones  del usuario.
        double resultadoSuma = CalculadoraSimple.Suma(numero1, numero2);
        double resultadoResta = CalculadoraSimple.Resta(numero1, numero2);
        double resultadoMultiplicacion = CalculadoraSimple.Multiplicacion(numero1, numero2);
        double resultadoDivision = CalculadoraSimple.Division(numero1, numero2);
	
	// Muestra el resultado de las operaciones.
        JOptionPane.showMessageDialog(null, "Resultado de la suma: " + resultadoSuma);
        JOptionPane.showMessageDialog(null, "Resultado de la resta: " + resultadoResta);
        JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + resultadoMultiplicacion);
        JOptionPane.showMessageDialog(null, "Resultado de la división: " + resultadoDivision);
	}

}
