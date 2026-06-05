package Overloadingandoverriding;

public class Notification {

    String mensaje;

    public Notification() {
        this.mensaje = "Sin mensaje";
    }

    public Notification(String mensaje) {
        this.mensaje = mensaje;
    }

    public void enviar() {
        System.out.println("Enviando notificación general: " + mensaje);
    }

    public void enviar(String destinatario) {
        System.out.println("Enviando notificación a " + destinatario + ": " + mensaje);
    }

    public void enviar(String destinatario, String prioridad) {
        System.out.println("Enviando notificación con prioridad " + prioridad + " a " + destinatario + ": " + mensaje);
    }
}