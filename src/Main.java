import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
           
            System.out.println("1. Hola Mundo y datos personales");
            System.out.println("2. Variables y tipos de datos");
            System.out.println("3. Operaciones matematicas");
            System.out.println("4. Entrada de datos con Scanner");
            System.out.println("5. Conversion de tipos y promedio");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    holaMundo();
                    break;

                case 2:
                    variablesTiposDatos();
                    break;

                case 3:
                    operacionesMatematicas();
                    break;

                case 4:
                    entradaDatos(entrada);
                    break;

                case 5:
                    conversionPromedio(entrada);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 0);

        entrada.close();
    }

    public static void holaMundo() {
        System.out.println("\n=== MI PRIMER PROGRAMA EN JAVA ===");
        System.out.println("Nombre: Angel Gabriel Valenzuela Barrera");
        System.out.println("Carnet: 0905-24-16183");
        System.out.println("Curso: Programacion I");
        System.out.println("Tema: Sintaxis basica de Java");
    }

    public static void variablesTiposDatos() {
        String nombre = "Angel Gabriel Valenzuela Barrera";
        String carnet = "0905-24-16183";
        int edad = 20;
        double estatura = 1.75;
        char seccion = 'A';
        boolean activo = true;

        System.out.println("\n=== VARIABLES Y TIPOS DE DATOS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Carnet: " + carnet);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Seccion: " + seccion);
        System.out.println("Estudiante activo: " + activo);
    }

    public static void operacionesMatematicas() {
        int numero1 = 20;
        int numero2 = 5;

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("\n=== OPERACIONES MATEMATICAS ===");
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
    }

    public static void entradaDatos(Scanner entrada) {
        String nombre;
        int edad;
        double nota;

        System.out.println("\n=== INGRESO DE DATOS ===");

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        System.out.print("Ingrese su nota final: ");
        nota = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("\n=== DATOS INGRESADOS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota final: " + nota);
    }

    public static void conversionPromedio(Scanner entrada) {
        int nota1;
        int nota2;
        int nota3;
        double promedio;

        System.out.println("\n=== CALCULO DE PROMEDIO ===");

        System.out.print("Ingrese nota 1: ");
        nota1 = entrada.nextInt();

        System.out.print("Ingrese nota 2: ");
        nota2 = entrada.nextInt();

        System.out.print("Ingrese nota 3: ");
        nota3 = entrada.nextInt();
        entrada.nextLine();

        promedio = (double) (nota1 + nota2 + nota3) / 3;

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Promedio: " + promedio);
    }
}