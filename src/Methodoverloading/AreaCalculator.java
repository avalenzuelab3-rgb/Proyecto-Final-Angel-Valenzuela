package Methodoverloading;

public class AreaCalculator {


    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public double calcularArea(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {

        System.out.println("Tema: Sobrecarga de Métodos");

        AreaCalculator calculadora = new AreaCalculator();

        System.out.println("Área de un cuadrado: " + calculadora.calcularArea(5));
        System.out.println("Área de un rectángulo: " + calculadora.calcularArea(8, 4));
        System.out.println("Área de un trapecio: " + calculadora.calcularArea(10, 6, 5));
        System.out.println("Área de un círculo: " + calculadora.calcularAreaCirculo(3));
    }
}