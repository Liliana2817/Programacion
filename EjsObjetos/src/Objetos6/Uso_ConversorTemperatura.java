package Objetos6;
import javax.swing.JOptionPane;
public class Uso_ConversorTemperatura {

	public static void main(String[] args) {
		// Obtener la temperatura en Celsius 
        String inputCelsius = JOptionPane.showInputDialog("Ingresa la tempratura en Celsius:");

        // Convertir la entrada a tipo double
        double temperaturaCelsius = Double.parseDouble(inputCelsius);

        // Crear un objeto de la clase ConversorTemperatura y llamar 
        ConversorTemperatura.convertirYMostrar(temperaturaCelsius);
	}

}
