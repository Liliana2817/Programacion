package Objetos5;

import java.util.ArrayList;
public class ListaEmpleados {

	public static void main(String[] args) {
		// Crea una ArrayList de objetos Empleado.
	     ArrayList<Empleado> ListaEmpleados = new ArrayList<>();
	     
	     //Agrega tres empleados a la lista.
	    
	     ListaEmpleados.add(new Empleado("Matti",5000.0,0,0,0));
	     ListaEmpleados.add(new Empleado("Mar",3050.0,0,0,0));
	     ListaEmpleados.add(new Empleado("Max",4600.0,0,0,0));

	     
	     //Utiliza un bucle (por ejemplo, un for-each) para recorrer la lista
	     
	     for(Empleado empleado : ListaEmpleados) {
	    	 System.out.println("Nombre: " + empleado.dameNombre() + ", Sueldo: " + empleado.dameSueldo() + "€");
	     }
	}

}
