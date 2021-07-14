package clase04;

import java.util.Scanner;

public class cp04 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Producto p = new Producto();
        System.out.print("Ingrese el código del producto: ");
        p.Codigo = leer.nextInt();
        System.out.print("Ingrese el precio del producto: ");
        p.precioCompra = leer.nextFloat();
        System.out.print("Ingrese la cantidad en bodega: ");
        p.cantidadBodega = leer.nextInt();
        System.out.print("Ingrese la cantidad mínima requerida: ");
        p.cantidadMinima = leer.nextInt();

        if (p.SolicitarPedido()) {
            System.out.println("Alerta! Debe solicitar pedido al proveedor!");
        } else {
            System.out.println("No debe solictar pedido.");            
        }
        leer.close();
    }
}
