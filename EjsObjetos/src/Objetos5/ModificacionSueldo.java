package Objetos5;

public class ModificacionSueldo {

	public static void main(String[] args) {
		//Creacción de un Objeto(instancia la clase)
		 Empleado Empleado2 = new Empleado("Mari", 3000.0, 2, 2,0);
         
         //Muestra el sueldo actual
       System.out.println("Su sueldo actual del empleado2 es de: " + Empleado2.dameSueldo() + "€");
        
         //Aumenta el sueldo del empleado
         Empleado2.subeSueldo(10);
	
         //Nuevo sueldo del empleado
      System.out.println("Nuevo sueldo del empleado2 es: " + Empleado2.dameSueldo() + "€");
	}

}
