package AbstractSobrecarga;

public class Uso_Notificacion {

	public static void main(String[] args) {
		// Ejemplo de uso
        CorreoElectronico correo = new CorreoElectronico("Hola, ¿cómo estás?, ¿Cómo te encuentras?", "Nose@queti.com", "Saludo");
        correo.enviar();

        System.out.println();

        SMS sms = new SMS("Este es un mensaje de no se que mensaje pero bueno", "+123456789", 160);
        sms.enviar();

        System.out.println();

        NotificacionApp app = new NotificacionApp("Nueva actualización disponible", "Usuario123", "ABC123");
        app.enviar();
	}

}
