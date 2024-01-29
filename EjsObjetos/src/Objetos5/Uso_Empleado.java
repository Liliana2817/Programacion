package Objetos5;
import java.util.Date;
public class Uso_Empleado {

	public static void main(String[] args) {
		// Pasa los parámetros
	       Empleado Empleado1 = new Empleado("Liliana", 3000.0, 2022, 1, 1);
		
	      // Obtener los datos del empleado.
	      String NombreEmpleado = Empleado1.dameNombre();
	      double SueldoEmpleado = Empleado1.dameSueldo();
	      Date FechaContrato = Empleado1.dameFechaContrato();

	      
	      //Imprime los datos en la consola.
	      System.out.println("Nombre del emplead@: " + NombreEmpleado);
	      System.out.println("Sueldo del emplead@: " + SueldoEmpleado + " €");
	      System.out.println("Fecha del contrato del emplead@: " + FechaContrato);
	}

}
