package Overloadingandoverriding;

public class Main {

    public static void main(String[] args) {

        System.out.println("Tema: Method Overloading and Overriding");

        Notification notificacion = new Notification("La fecha de entrega está cerca");

        System.out.println("Ejemplo de sobrecarga de métodos:");
        notificacion.enviar();
        notificacion.enviar("Angel ");
        notificacion.enviar("Angel", "urgente");

        System.out.println();

        System.out.println("Ejemplo de sobrescritura de métodos:");
        EmailNotification correo = new EmailNotification("Revisa tu repositorio de GitHub");
        correo.enviar();
    }
}