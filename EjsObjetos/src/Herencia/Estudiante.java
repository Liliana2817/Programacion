package Herencia;

public class Estudiante extends Persona{
	//variable
		private String Carrera;
		
		//constructor
		public Estudiante(String Nombre, int Edad, String Carrera) {
			super(Nombre, Edad);
			this.Carrera = Carrera;
		}

		//getter
		public String getCarrera() {
			return Carrera;
}
}