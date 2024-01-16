package Objetos2;

public class Automovil {
  private String marca , modelo;

  
  public  Automovil (){
	  marca = "citroen";
	  modelo = "citroen c4";
  }
  
  public void establece_marca(){
	  marca = "citroen";
  }
  public String dime_marca() {//GETTER
		return " El automovil de marca  " + marca + " .";
	}
  public String dime_modelo() {//GETTER
		return "El modelo del automovil es " + modelo + " . ";
	}
}
