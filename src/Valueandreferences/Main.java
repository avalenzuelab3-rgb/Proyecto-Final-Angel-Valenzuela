package Valueandreferences;

public class Main {
	public static void cambiarNotaPrimitiva(int nota) {
        nota = 100;
        System.out.println("Dentro del método cambiarNotaPrimitiva: " + nota);
    }

    public static void cambiarDatosObjeto(Student Student) {
    	Student.nombre = "Luis";
    	Student.nota = 95;
        System.out.println("Dentro del método cambiarDatosObjeto:");
        Student.mostrarDatos();
    }

    public static void main(String[] args) {

        System.out.println("Tema: Valor y Referencia");

        int nota = 70;

        System.out.println("Nota antes del método: " + nota);
        cambiarNotaPrimitiva(nota);
        System.out.println("Nota después del método: " + nota);

        System.out.println();

        Student estudiante1 = new Student("Jose", 80);

        System.out.println("Objeto antes del método:");
        estudiante1.mostrarDatos();

        cambiarDatosObjeto(estudiante1);

        System.out.println("Objeto después del método:");
        estudiante1.mostrarDatos();
    }
}