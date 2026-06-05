package Overloadingandoverriding;

public class EmailNotification extends Notification {

    public EmailNotification(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo electrónico con el mensaje: " + mensaje);
    }
}