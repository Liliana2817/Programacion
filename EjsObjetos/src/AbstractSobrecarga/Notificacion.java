package AbstractSobrecarga;

public abstract class Notificacion {
	// Propiedades comunes
    protected String Mensaje;
    protected String Destinatario;

    // Constructor con sobrecarga
    public Notificacion(String mensaje, String destinatario) {
        this.Mensaje = mensaje;
        this.Destinatario = destinatario;
    }

    // Método abstracto enviar
    public abstract void enviar();
}

// Clase concreta CorreoElectronico
class CorreoElectronico extends Notificacion {
    // Propiedad específica
    private String asunto;

    // Constructor con sobrecarga
    public CorreoElectronico(String mensaje, String destinatario, String asunto) {
        super(mensaje, destinatario);
        this.asunto = asunto;
    }

    // Implementación del método enviar
    @Override
    public void enviar() {
        System.out.println("Enviando correo electrónico a " + Destinatario + " con asunto '" + asunto + "':");
        System.out.println("Mensaje: " + Mensaje);
    }
}

// Clase concreta SMS
class SMS extends Notificacion {
    // Propiedad específica
    private int limiteCaracteres;

    // Constructor con sobrecarga
    public SMS(String mensaje, String destinatario, int limiteCaracteres) {
        super(mensaje, destinatario);
        this.limiteCaracteres = limiteCaracteres;
    }

    // Implementación del método enviar
    @Override
    public void enviar() {
        System.out.println("Enviando SMS a " + Destinatario + ":");
        System.out.println("Mensaje: " + Mensaje);
        System.out.println("Limite de caracteres: " + limiteCaracteres);
    }
}
//Clase concreta NotificacionApp
class NotificacionApp extends Notificacion {
 // Propiedad específica
 private String idDispositivo;

 // Constructor con sobrecarga
 public NotificacionApp(String mensaje, String destinatario, String idDispositivo) {
     super(mensaje, destinatario);
     this.idDispositivo = idDispositivo;
 }

 // Implementación del método enviar
 @Override
 public void enviar() {
     System.out.println("Enviando notificación a la aplicación en el dispositivo " + idDispositivo + ":");
     System.out.println("Mensaje: " + Mensaje);
 }
}
