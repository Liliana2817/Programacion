package AbstractSobrecarga;

public class Uso_Empleado {

	public static void main(String[] args) {
		// Ejemplo de uso
        EmpleadoPermanente Emp1 = new EmpleadoPermanente("Juana", 101, 3000.0, 500.0);
        Emp1.mostrarDetalles();

        System.out.println();

        EmpleadoTemporal Emp2 = new EmpleadoTemporal("Mar", 102, 2000.0, 6);
        Emp2.mostrarDetalles();

        System.out.println();

        EmpleadoContratista Emp3 = new EmpleadoContratista("Carlota", 103, 2500.0, 12);
        Emp3.mostrarDetalles();

	}

}
