package SobrecargaConstructores;

public class Uso_Estudiante {

	public static void main(String[] args) {
		// Crear instancias de Estudiante con diferentes constructores
        Estudiante estudiante1 = new Estudiante("Juan", 20, 3.5);
        Estudiante estudiante2 = new Estudiante("María", 22);
        Estudiante estudiante3 = new Estudiante("Carlos");

        // Mostrar información de los estudiantes
        System.out.println("Información del estudiante 1:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Promedio académico: " + estudiante1.getPromedioAcademico());
        System.out.println();

        System.out.println("Información del estudiante 2:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Promedio académico: " + estudiante2.getPromedioAcademico());
        System.out.println();

        System.out.println("Información del estudiante 3:");
        System.out.println("Nombre: " + estudiante3.getNombre());
        System.out.println("Edad: " + estudiante3.getEdad());
        System.out.println("Promedio académico: " + estudiante3.getPromedioAcademico());
	}

}
