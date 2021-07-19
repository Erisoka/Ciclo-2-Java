package clase07;

import java.util.Scanner;

public class cp07 {
    public static Scanner leer = new Scanner(System.in);
    public static Producto productos[];

    public static void main(String[] args) {
        LeerDatos2();
        Alerta();
        MayorCantidadBodega();
        RealizarCompra();
        CambiarCantidadMinima();
    }

    public static void LeerDatos() {
        System.out.print("Ingrese Número de Productos a manejar: ");
        int n = leer.nextInt();
        productos = new Producto[n];
        
        for (int i = 0; i < productos.length; i++) {
            productos[i] = new Producto();
            System.out.print("Ingrese Código del Producto "+(i+1)+": ");
            productos[i].setCodigo(leer.nextInt());
            System.out.print("Ingrese Precio de Compra del Producto "+(i+1)+": ");
            productos[i].setPrecioCompra(leer.nextFloat());
            System.out.print("Ingrese Cantidad en Bodega del Producto "+(i+1)+": ");
            productos[i].setCantidadBodega(leer.nextInt());
            System.out.print("Ingrese Cantidad Minima Requerida del Producto "+(i+1)+": ");
            productos[i].setCantidadMinima(leer.nextInt());
            System.out.print("Ingrese Cantidad Máxima Inventario Permitido del Producto "+(i+1)+": ");
            productos[i].setCantidadMaxima(leer.nextInt());
        }
    }

    public static void LeerDatos2() {
        String entrada;
        String lineas[];
        System.out.print("Ingrese Número de Productos a manejar: ");
        int n = leer.nextInt();
        productos = new Producto[n];
        System.out.println("Ingrese los productos separados por espacio:");
        entrada = leer.nextLine(); // se pierde
        
        for (int i = 0; i < productos.length; i++) {
            productos[i] = new Producto();
            entrada = leer.nextLine();
            lineas = entrada.split(" ");
            productos[i].setCodigo(Integer.parseInt(lineas[0]));
            productos[i].setPrecioCompra(Float.parseFloat(lineas[1]));
            productos[i].setCantidadBodega(Integer.parseInt(lineas[2]));
            productos[i].setCantidadMinima(Integer.parseInt(lineas[3]));
            productos[i].setCantidadMaxima(Integer.parseInt(lineas[4]));
        }
    }

    public static void Alerta() {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].SolicitarPedido()) {
                System.out.println("Alerta! Debe solicitar pedido para el producto con codigo: "+productos[i].getCodigo());
            }
        }
    }

    public static void MayorCantidadBodega() {
        int mayor = -Integer.MIN_VALUE;
        int posicion = -1;
        for (int j = 0; j < productos.length; j++) {
            if (productos[j].getCantidadBodega() > mayor) {
                mayor = productos[j].getCantidadBodega();
                posicion = j;
            }
        }
        System.out.println("El producto con codigo "+ productos[posicion].getCodigo() +" con mayor cantidad en bodega: "+productos[posicion].getCantidadBodega());
    }

    public static void RealizarCompra() {
        System.out.print("Ingrese el Código del Producto a comprar: ");
        int codigo = leer.nextInt();
        System.out.print("Ingrese la cantidad de Productos a compras: ");
        int cantidad = leer.nextInt();
        boolean encontrado = false;
        int i = 0;
        float totalPagar;

        while (!encontrado && i < productos.length) {
            if (productos[i].getCodigo() == codigo) {
                totalPagar = productos[i].CantidadTotalPagar(cantidad);
                System.out.println("Total a pagar para el Producto "+productos[i].getCodigo()+" : $"+totalPagar );
                encontrado = true;
            }
            i++;
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado!");
        }
    }

    public static void CambiarCantidadMinima() {
        System.out.print("Ingrese el Código del Producto a cambiar: ");
        int codigo = leer.nextInt();
        boolean encontrado = false;
        int i = 0;

        while (!encontrado && i < productos.length) {
            if (productos[i].getCodigo() == codigo) {
                System.out.print("Ingrese la nueva cantidad minima requerida: ");
                int cantidadMinima = leer.nextInt();
                productos[i].setCantidadMinima(cantidadMinima);
                encontrado = true;
            }
            i++;
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado!");
        }
    }

}

/*
codigo prod - precio - cant bodega - cant min - cant max
9
1 25000 45 30 55
2 3000 15 20 30
3 1500 10 15 25
4 850 60 55 75
5 750 70 75 85
6 1500 90 85 110
7 10000 35 40 70
8 75000 55 60 80
9 36500 85 90 120
*/