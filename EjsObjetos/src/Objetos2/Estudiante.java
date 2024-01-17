package Objetos2;

public class Estudiante {
	  // Atributos de la clase
    private String nombre;
    private int edad;
    private double calificacion;
    
    //constructor
    public Estudiante() {
        nombre = "Lili";
        edad  = 23;
        calificacion = 8.5;
    }

    // Método para obtener el nombre del estudiante//GETTER
    public String dime_nombre() {
        return "El nombre del estudiante es " + nombre;
    }

    // Método para establecer un nombre específico (en este caso, "Lili")//SETTER
    public void establece_nombre() {
        nombre = "Lili";
    }

    // Método para obtener la edad del estudiante
    public String dime_edad() {
        return "La edad del estudiante es " + edad;
    }

    // Método para establecer la edad del estudiante
    public void establece_edad() {
        edad = 101;

        // Validación: la edad solo puede ser de 0 a 100 años y un número positivo
        if (edad >= 0 && edad <= 100) {
            // Si la edad es válida, se establece
            edad = edad;
        } else {
            // Si la edad no es válida, se muestra un mensaje en la consola
            System.out.println("La edad solo puede ser de 0 a 100 años y un número positivo");
        }
    }

    // Método para obtener la calificación del estudiante//GETTER
    public String dime_calificacion() {
        return "La calificación del estudiante es " + calificacion;
    }

    // Método para establecer la calificación del estudiante
    public void establece_calificacion() {//SETTER
        calificacion = 6.5;
    }
}