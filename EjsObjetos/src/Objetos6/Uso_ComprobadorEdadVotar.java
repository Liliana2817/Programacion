package Objetos6;
import javax.swing.JOptionPane;
public class Uso_ComprobadorEdadVotar {

	public static void main(String[] args) {
		// Se obtiene la edad del usuario
		String inputEdad = JOptionPane.showInputDialog("Escribe tu Edad: ");

		//la entrada se convierte en tipo int
		int edad = Integer.parseInt(inputEdad);
		
		//
		ComprobadorEdadVotar.verificar(edad);
	}

}
