package Objetos6;

import javax.swing.JOptionPane;

public class ComprobadorEdadVotar {
	// variable
public static final int EdadMinimaParaVotar = 18;

public static int getEdadminimaparavotar() {
	return EdadMinimaParaVotar;
}
public static void verificar(int edad) {
	if (edad >= EdadMinimaParaVotar) {
		JOptionPane.showMessageDialog(null, " ¡Eres mayor de edad, puedes votar!");		
	} else {
		JOptionPane.showMessageDialog(null, " ¡Lo siento, tu no eres  mayor de edad, no puedes votar!");		
	}
 }

}
