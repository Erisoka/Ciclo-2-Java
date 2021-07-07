package clase02;

import java.util.Scanner;

public class practicaSesion02 {
    public static Scanner leer = new Scanner(System.in);

    public static void leerDatos(int v[], int n, String m) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Ingrese el valor del vector " + m + "[" + (i + 1) + "]: ");
            v[i] = leer.nextInt();
        }
    }

    public static void imprimir(int v[], int n, String m) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("El valor del vector " + m + "[" + (i + 1) + "]: " + v[i]);
        }
    }

    public static int mayorValor(int[] vector) {
        int mayor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public static int menorValor(int[] vector) {
        int menor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        return menor;
    }

    // Busca el valor x en el vector y devuelve su posición
    public static int buscarValor(int[] vector, int x) {
        int pos = 0;
        while (pos <= vector.length) {
            if (vector[pos] == x) {
                return pos;
            } else {
                pos++;
            }
        }        
        return 0;
    }

    public static void main(String[] args) {
        int vCodigo[], vBodega[], vCantMinima[];

        System.out.print("Ingrese tamaño de las listas: ");
        int n = leer.nextInt();
        vCodigo = new int[n];
        vBodega = new int[n];
        vCantMinima = new int[n];

        leerDatos(vCodigo, n, "Código");
        leerDatos(vBodega, n, "Cantidad en Bodega");
        leerDatos(vCantMinima, n, "Cantidad Minima");

        System.out.println("--- Imprimiendo los datos de los Vectores ---");
        imprimir(vCodigo, n, "Código");
        imprimir(vBodega, n, "Cantidad en Bodega");
        imprimir(vCantMinima, n, "Cantidad Minima");

        System.out.println("--- Productos que se necesitan pedir ---");
        for (int i = 0; i < vCantMinima.length; i++) {
            if (vBodega[i] < vCantMinima[i]) {
                System.out.println(vCodigo[i]);
            }
        }

        int mayorBodega = mayorValor(vBodega);
        int menorBodega = menorValor(vBodega);
        int posMayor = buscarValor(vBodega, mayorBodega);
        int posMenor = buscarValor(vBodega, menorBodega);
        System.out.println("Código con mayor número de unidades: "+ vCodigo[posMayor]);
        System.out.println("Código con menor número de unidades: "+ vCodigo[posMenor]);

        leer.close();
    }
}
