package Valueandreferences;

public class Student {

	String nombre;
    int nota;

    public Student(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
    }
}