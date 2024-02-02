package Objetos6;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

    //variables 
	 public static final double FactorConversion = 1.8;
	 public static final double Ajuste = 32;
	
	
	public double dameFactorConversion() {//getter
		return FactorConversion;
	}
	public double dameAjuste() {//getter
		return Ajuste;
	}

	
	    // Realiza la conversión y muestra  el resultado
    public static void convertirYMostrar(double temperaturaCelsius) {
        // Realiza la conversión a Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * ConversorTemperatura.FactorConversion) + ConversorTemperatura.Ajuste;

        // Mustra el resultado usando JOptionPane
        String mensaje = String.format("%.2f Celsius es igual a %.2f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);
        JOptionPane.showMessageDialog(null, mensaje);

    }
}