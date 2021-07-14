package clase05;
import java.util.Scanner;

public class cp05 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Ingrese la cantidad de productos a manejar: ");
        int n = leer.nextInt();
        Producto productos[] = new Producto[n];

        for (int i = 0; i < productos.length; i++) {
            productos[i] = new Producto();
            System.out.print("Ingrese el codigo del Producto "+ (i+1) +": ");
            productos[i].setCodigo(leer.nextInt());
            System.out.print("Ingrese el precio del Producto "+ (i+1) +": ");
            productos[i].setPrecioCompra(leer.nextInt());
            System.out.print("Ingrese la cantidad en bodega del Producto "+ (i+1) +": ");
            productos[i].setCantidadBodega(leer.nextInt());
            System.out.print("Ingrese la cantidad minima del Producto "+ (i+1) +": ");
            productos[i].setCantidadMinima(leer.nextInt());
        }

        int menor = Integer.MAX_VALUE;
        int posicion = -1;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].solicitarPedido()) {
                System.out.println("Debe solicitar pedido para el producto con codigo: "+productos[i].getCodigo());
            } else {
                System.out.println("No se solicita pedido para el producto con codigo: "+productos[i].getCodigo());
            }
            if (productos[i].getCantidadBodega() < menor) {
                menor = productos[i].getCantidadBodega();
                posicion = i;
            }
        }
        System.out.println("El producto con codigo "+ productos[posicion].getCodigo() +" con menor cantidad en bodega: "+productos[posicion].getCantidadBodega());

        leer.close();
    }
}
