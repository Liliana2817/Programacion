package Objetos7;

import javax.swing.JOptionPane;

public class ContadorMétodo {
	private static int contador_Llamada = 0;
	 
	// Constructor
	public ContadorMétodo() {}
 
	// Método que muestra saludo
	public void saludar() {
		JOptionPane.showMessageDialog(null, "Saludos " + (++contador_Llamada));
	}
 
	public static int dimeTotalLlamadas() {
		return contador_Llamada;
}
}