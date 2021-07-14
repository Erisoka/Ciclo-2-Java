package clase05;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class sesion05 {
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        Estudiante est1 = new Estudiante();
        System.out.println("El promedio del estudiante 1 es: "+est1.Promedio());

        System.out.print("Favor Ingrese el Nombre del Estudiante 2: ");
        String nombre = leer.nextLine();
        System.out.print("Favor Ingrese la Nota 1: ");
        float nota1 = leer.nextFloat(); // Pide con la coma (,) eje: 4,5 (No 4.5)
        System.out.print("Favor Ingrese la Nota 2: ");
        float nota2 = leer.nextFloat();
        System.out.print("Favor Ingrese la Nota 3: ");
        float nota3 = leer.nextFloat();
        Estudiante est2 = new Estudiante(nombre, nota1, nota2, nota3);
        System.out.println("El promedio del estudiante 2 es: "+est2.Promedio()); // 4.5
        System.out.printf("El promedio del estudiante 2 es: %.2f %n",est2.Promedio()); // 4,50
        DecimalFormatSymbols separator = new DecimalFormatSymbols();
        separator.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("0.00", separator);
        System.out.println("El promedio del Estudiante 2 es "+ f.format(est2.Promedio())); // 4.50
        System.out.println("El promedio de "+ est2.getNombre() + " es: "+f.format(est2.Promedio())); // 4.50

        leer.close();
    }
}
