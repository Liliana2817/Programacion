package Objetos6;
import javax.swing.JOptionPane;
public class Uso_DeterminadorAñoBisiesto {

	public static void main(String[] args) {
		// Obtiene el año
        String inputYear = JOptionPane.showInputDialog("Ingresa el año");
        //Convierte la entrada en tipo int
        int Year =Integer.parseInt(inputYear);
        //Crea un Obtejo y lla,a al metodo
        DeterminadorAñoBisiesto.determinar(Year);
	}

}
