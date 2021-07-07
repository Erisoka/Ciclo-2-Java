package clase02;

import java.util.Scanner;
import java.util.Random;

public class vectoresEjemplo02 {

    public static void leerDatos(int v[], int n) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.print("Ingrese el valor del vector V[" + (i + 1) + "]: ");
            v[i] = leer.nextInt();
        }
        leer.close();
    }

    public static void imprimir(int v[], int n) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("El valor del vector V["+(i+1)+"]: " + v[i]);
        }
    }

    // Llenar con enteros aleatorios el vector
    public static void aleatorio(int v[], int n) {
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(20);
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ejemplo con vectores unidimensionales");

        System.out.print("Ingrese tamaño vector: ");
        int n = leer.nextInt();
        int v[] = new int[n];

        // leerDatos(v, n);
        aleatorio(v, n);
        imprimir(v, n);

        leer.close();
    }

}
