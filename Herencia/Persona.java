package Herencia;

public class Persona {
	//variables
		private String Nombre;
		private int Edad;
		
		//constructor
		public Persona(String Nombre, int Edad) {
			this.Nombre=Nombre;
			this.Edad=Edad;
		}
		//getters
		public String getNombre() {
			return Nombre;
		}
		public int getEdad() {
			return Edad;
}
}