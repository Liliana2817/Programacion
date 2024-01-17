package Objetos3;


public class Uso_Alarma {

	public static void main(String[] args) {
		
	   Alarma Alarma = new Alarma();
    	System.out.println(Alarma.dime_horaAlarma());
    	System.out.println(Alarma.dime_horaActual());
    	 Alarma.establece_AlarmaActiva(true);
    	 Alarma.establece_comprobarAlarma();
    }

}
