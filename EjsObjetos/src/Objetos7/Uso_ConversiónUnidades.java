package Objetos7;

import javax.swing.JOptionPane;

public class Uso_ConversiónUnidades {

	public static void main(String[] args) {
		 
	        
		//seleccionar el tipo de conversión
        int opcion = (Integer.parseInt(JOptionPane.showInputDialog("Elige la conversión a realizar\n" +
                "1. Kilómetros a millas\n" +
                "2. Millas a kilómetros\n" +
                "3. Grados Celsius a Fahrenheit\n" +
                "4. Grados Fahrenheit a Celsius\n" +
                "Selecciona una opción: ")));
    
	        
	        //introducir el valor a convertir
	        double valor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor a convertir: "));        	   
		
	        //mostrar el valor convertido
		    double valorConvertido = ConversiónUnidades.convertirValor(opcion, valor);
           String mensaje = "El valor convertido es: " + valorConvertido;
           JOptionPane.showMessageDialog(null, mensaje);
	    
	      
	}

}
