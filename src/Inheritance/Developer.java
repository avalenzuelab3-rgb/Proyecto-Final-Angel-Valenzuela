package Inheritance;

public class Developer extends Employee {

    String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void code() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }

    public void showDeveloperInformation() {
        showInformation();
        System.out.println("Programming language: " + programmingLanguage);
    }
}