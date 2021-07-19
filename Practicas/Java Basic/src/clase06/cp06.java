package clase06;

import java.util.Scanner;

public class cp06 {
    public static Scanner leer = new Scanner(System.in);
    public static Producto productos[];

    public static void main(String[] args) {
        leerDatos();
        Alerta();
        MayorCantidadBodega();
        RealizarCompra();
    }

    public static void leerDatos() {
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

}
