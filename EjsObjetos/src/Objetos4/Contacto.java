package Objetos4;

public class Contacto {
	//Declarar las variables
		private String Nombre;
		private String NumTelefono;
		private String Email;
		// Constructor con parametros
		public Contacto(String Nombre, String NumTelefono, String Email) {
			establecerNombre(Nombre);
			establecerTelefono(NumTelefono);
			establecerEmail(Email);
		}
		// getter and setter para nombre
		public String dimeNombre() {
			return this.Nombre;
		}
		public void establecerNombre(String newName) {
			if (newName != null) {
				this.Nombre = newName;
			}
		}
		// getter and setter para número de télefono
		public String dimeTelefono() {
			return this.NumTelefono;
		}
		public void establecerTelefono(String newNumberTelephon) {
			if (newNumberTelephon != null) {
				this.NumTelefono = newNumberTelephon;
			}
		}
		// getter and setter para email
		public String dimeEmail() {
			return this.Email;
		}
		public void establecerEmail(String newEmail) {
			if (newEmail != null) {
				this.Email = newEmail;
			}
		}
		// Método to String para mostrar el contacto
		public String toString() {
			String resultado = "Nombre del contacto: " + this.Nombre;
			resultado += "\nNúmero de télefono: " + this.NumTelefono;
			resultado += "\nEmail: " + this.Email;
			return resultado;
}
}
