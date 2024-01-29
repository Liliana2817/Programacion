package Objetos5;
import java.util.ArrayList;
public class AumentoSueldoCondicionado {

	public static void main(String[] args) {
		// Crea una ArrayList de objetos Empleado.
	     ArrayList<Empleado> ListaEmpleados = new ArrayList<>();
	     
		// Lista de empleados contratados antes del 2021.
		 ListaEmpleados.add(new Empleado("Mattia",5000.0,2020,2,1));
	     ListaEmpleados.add(new Empleado("Mar",3050.0,2021,3,10));
	     ListaEmpleados.add(new Empleado("Maxi",4600.0,2019,9,15));

	     // Lista de empleados y aumentar el sueldo en un 5% solo a aquellos contratados antes de 2021.
	     for(Empleado empleado : ListaEmpleados) {
	    	if( empleado.dameFechaContrato().getYear() <121) {
	    		empleado.subeSueldo(5);
	    	}
	     }
	     // Mostrar los nombres y sueldos actualizados.
	     System.out.println("Nombres y sueldos actualizados: ");
	     for(Empleado empleado : ListaEmpleados) {
	    	 System.out.println("Nombre: " + empleado.dameNombre() + ", Sueldo: " + empleado.dameSueldo() + "€");
	     }
	}

}
