// package reto02;

public class App {
    public static void main(String[] args) {
        SchoolGradingSystem colegio = new SchoolGradingSystem();
        colegio.readData();
        System.out.println(colegio.question1());
        System.out.println(colegio.question2());
        System.out.println(colegio.question3());
        System.out.println(colegio.question4());
    }
}
