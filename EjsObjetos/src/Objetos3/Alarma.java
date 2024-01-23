package Objetos3;

//Variable
public class Alarma {
  private String horaAlarma;
  private String horaActual;
  private boolean AlarmaActiva;
   
//Constructor
   public Alarma() {
	   horaAlarma = "10:00";
	   horaActual = "00:00";
	   AlarmaActiva =  false;
   }
   
   public String dime_horaAlarma() {//GETTER
		return  horaAlarma;
	}
   public void horaAlarma(String horaAlarma) {//SETTER
		this.horaAlarma = horaAlarma;
	}
   public String dime_horaActual() {
		return horaActual;
	}

	public void establece_horaActual(String horaActual) {
		this.horaActual = horaActual;
	}

	// Método para activar/desactivar la alarma
	public void establece_AlarmaActiva(boolean AlarmaActiva) {
		this.AlarmaActiva = AlarmaActiva;
	}

	// Método que comprueba si la alarma debe sonar
	public void establece_comprobarAlarma() {
		if ( AlarmaActiva && horaActual.equals(horaAlarma)) {
			System.out.println("Alarma sonando");
		}else{
			System.out.println("Alarma no sonando");
		}
	}
}
