package Objetos2;

public class Uso_Estudiante {

	public static void main(String[] args) {
		Estudiante EstudianteLili = new  Estudiante();
		EstudianteLili.establece_nombre();
		System.out.println(EstudianteLili.dime_nombre());
		
		EstudianteLili.establece_edad();
		System.out.println(EstudianteLili.dime_edad());
		
		EstudianteLili.establece_calificacion();
		System.out.println(EstudianteLili.dime_calificacion());
	}

}
