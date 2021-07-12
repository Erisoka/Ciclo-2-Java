package clase03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class practicasesion03 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        String listaCodigoProducto[];
        int tablaCantidadBodega[][];
        int tablaCantidadMinima[][];

        System.out.println("Ingrese los codigos de columna separados por espacio:");
        String linea = leer.nextLine(); //entra: "354 256 127"
        listaCodigoProducto = linea.split(" "); //guarda vector con los string ['354','256','127']
        int cantidadProductos = listaCodigoProducto.length; // 3 (tipos de producto)

        System.out.println("Ingrese los datos de la Tabla Cantidad en Bodegas, separando filas con ; y cantidades por espacios.");
        linea = leer.nextLine(); //entra: "17 34 60;14 31 65;45 2 12;56 43 8"
        System.out.println("=== Datos Tabla Cantidad en Bodega ===");
        String filas[]=linea.split(";");//guarda cada fila de string ["17 34 60","14 31 65","45 2 12","56 43 8"]
        int cantidadSedes = filas.length; // 4 (sedes)
        tablaCantidadBodega = new int[cantidadSedes][cantidadProductos];
        tablaCantidadMinima = new int[cantidadSedes][cantidadProductos];

        // Llenar la Tabla de Cantidad en Bodega
        for (int i = 0; i < cantidadSedes; i++) {
            String cantidades[] = filas[i].split(" "); // para i = 0, guarda en cantidades ["17","34","60"]
            for (int j = 0; j < cantidadProductos; j++) {
                tablaCantidadBodega[i][j] = Integer.parseInt(cantidades[j]); // para j = 0, guarda el int 17
                System.out.print(tablaCantidadBodega[i][j] + " ");
            }
            System.out.println();
        }

        //Leer y llenar la Tabla de Cantidad Minima
        System.out.println("Ingrese los datos de la Tabla Cantidad Minima, separando filas con ; y cantidades por espacios.");
        linea = leer.nextLine(); //entra: "14 44 76;10 51 15;46 23 2;89 4 18"
        filas = linea.split(";");// guarda cada fila de string ["14 44 76","10 51 15","46 23 2","89 4 18"]
        System.out.println("=== Datos Tabla Cantidad Mínima ===");
        for (int i = 0; i < cantidadSedes; i++) {
            String cantidades[] = filas[i].split(" "); // para i = 0, guarda en cantidades ["14","44","76"]
            for (int j = 0; j < cantidadProductos; j++) {
                tablaCantidadMinima[i][j] = Integer.parseInt(cantidades[j]); // para j = 0, guarda el int 14
                System.out.print(tablaCantidadMinima[i][j] + " ");
            }
            System.out.println();
        }

        //Indicar codigos de los productos en los cuales se deben realizar los pedidos.
        System.out.println("=== Solicitar Productos ===");
        for (int i = 0; i < cantidadSedes; i++) {
            for (int j = 0; j < cantidadProductos; j++) {
                if (tablaCantidadBodega[i][j] < tablaCantidadMinima[i][j]) {
                    System.out.println("Se debe solicitar producto "+ listaCodigoProducto[j] +" en sede "+ i);
                }
            }
        }
        DecimalFormat f = new DecimalFormat("0.000");
        // Promedio de las cantidades de cada producto en bodega y su respectivo codigo
        float mayor = 0; int codigoMayor = 0;
        for (int j = 0; j < cantidadProductos; j++) {
            float sumador = 0; float contador = 0;
            for (int i = 0; i < cantidadSedes; i++) {
                sumador = sumador + tablaCantidadBodega[i][j];
                contador = contador + 1;
            }
            if (contador > 0) {
                // System.out.println("La suma del producto "+listaCodigoProducto[j]+" es: "+sumador);
                // System.out.println("El contador del producto "+listaCodigoProducto[j]+" es: "+contador);
                Float promedio = (sumador/contador);
                // System.out.println("El promedio de productos del código " + listaCodigoProducto[j] + " es " + promedio);
                System.out.println("El promedio de productos del código " + listaCodigoProducto[j] + " es " +f.format(promedio));
                if (promedio > mayor) {
                    mayor = promedio;
                    codigoMayor = j;
                }
            }
        }
        System.out.println("El código con mayor promedio es: "+listaCodigoProducto[codigoMayor]+" con valor: "+ mayor);
    }
}
