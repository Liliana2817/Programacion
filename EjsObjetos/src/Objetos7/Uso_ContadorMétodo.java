package Objetos7;

import javax.swing.JOptionPane;

public class Uso_ContadorMétodo {

	public static void main(String[] args) {
		ContadorMétodo[] contadores = new ContadorMétodo[10];
 
		for (int i = 0; i < contadores.length; i++) {
			contadores[i] = new ContadorMétodo();
			contadores[i].saludar();
		}
		// Aquí usamos la clase para saber cuantas veces si hizo la llamada del método
		// saludar
		JOptionPane.showMessageDialog(null,
				"El método saludar ha sido llamado " + ContadorMétodo.dimeTotalLlamadas() + " veces");

	}

}
