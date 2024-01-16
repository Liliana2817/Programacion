package Objetos2;

public class Automovil {
	// Declarar las variables
  private String marca , modelo;

  
  public  Automovil (){
	// construtor: Se define un constructor sin parámetros que establece un titular predeterminado
	  marca = "citroen";
	  modelo = "citroen c4";
  }
  
  public void establece_marca(){//SETTER
	  marca = "citroen";
  }
  public String dime_marca() {//GETTER
		return " El automovil de marca  " + marca + " .";
	}
  public String dime_modelo() {//GETTER
		return "El modelo del automovil es " + modelo + " . ";
	}
}
