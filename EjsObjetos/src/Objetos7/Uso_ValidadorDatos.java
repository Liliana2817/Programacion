package Objetos7;

import javax.swing.JOptionPane;

public class Uso_ValidadorDatos {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"-5678 es un número: " + ValidadorDatos.isNumber("-5678"));
		JOptionPane.showMessageDialog(null,"-5678- es un número: " + ValidadorDatos.isNumber("-5678-"));
		JOptionPane.showMessageDialog(null,"-56-78 es un número: " + ValidadorDatos.isNumber("-56-78"));
		JOptionPane.showMessageDialog(null,"5678 es un número: " +ValidadorDatos.isNumber("5678"));
		JOptionPane.showMessageDialog(null, "El 5 está en el rango 0 y 10: " + ValidadorDatos.isInRange(5, 0, 10));
		JOptionPane.showMessageDialog(null, "El 15 está en el rango 0 y 10: " + ValidadorDatos.isInRange(15, 0, 10));

	}

}
