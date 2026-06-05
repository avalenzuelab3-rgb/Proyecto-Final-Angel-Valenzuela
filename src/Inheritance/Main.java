package Inheritance;

public class Main {

    public static void main(String[] args) {

        System.out.println("Topic: Inheritance");

        Developer developer = new Developer("Jose", 5500.00, "Java");

        developer.showDeveloperInformation();
        developer.work();
        developer.code();
    }
}