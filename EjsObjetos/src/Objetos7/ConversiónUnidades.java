package Objetos7;

public class ConversiónUnidades {
	 // Método para convertir kilómetros a millas
    public static double kilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }
    
    // Método  para convertir millas a kilómetros
    public static double millasAKilometros(double millas) {
        return millas * 1.60934;
    }
    
    // Método  para convertir grados Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }
    
    // Método  para convertir grados Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
   	public static double convertirValor(int opcion, double valor) {
   		switch (opcion) {
   			case 1:
   				return kilometrosAMillas(valor);
   			case 2:
   				return millasAKilometros(valor);
   			case 3:
   				return celsiusAFahrenheit(valor);
   			case 4:
   				return fahrenheitACelsius(valor);
   			default:
   				return 0;
   		}
}
}
