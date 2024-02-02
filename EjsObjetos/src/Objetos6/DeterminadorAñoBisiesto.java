package Objetos6;

import javax.swing.JOptionPane;

public class DeterminadorAñoBisiesto {
	// variables
public static final int Divisible_4 = 4;
public static final int Divisible_100 = 100;
public static final int Divisible_400 = 400;




//Metodo estatico
public static int getDivisible4() {
	return Divisible_4;
}




public static int getDivisible100() {
	return Divisible_100;
}




public static int getDivisible400() {
	return Divisible_400;
}




public static void determinar(int Year) {
	if((Year % Divisible_4 == 0 && Year % Divisible_100 !=0) || (Year % Divisible_400 == 0)) {
		JOptionPane.showMessageDialog(null, Year + " es un año bisiesto.");
	} else {
		JOptionPane.showMessageDialog(null, Year + " no es un año bisiesto.");
	}
}
}
