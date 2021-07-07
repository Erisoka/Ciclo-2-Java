package clase02;

import java.util.Scanner;

public class ejemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la candtidad en bodega: ");
        int bodega = entrada.nextInt();
        System.out.print("Ingrese la candtidad minima requerida: ");        
        int existencias_requeridas = entrada.nextInt();

        if (bodega < existencias_requeridas) {
            System.out.print("Entonces si es necesario realizar el pedido al proveedor. \nIngrese la Cantidades de unidades a comprar: ");
            int cantidad_compra = entrada.nextInt();
            System.out.print("Ingrese el valor por unidad: ");
            int valor_unitario = entrada.nextInt();
            System.out.print("Ingrese el valor en caja: ");
            int dinero_caja = entrada.nextInt();
            int valor_compra = cantidad_compra * valor_unitario;
            if (valor_compra < dinero_caja) {
                System.out.print("Si es posible realizar el pedido.");
            } else {
                System.out.print("No es posible realizar el pedido.");
            }
        } else {
            int unidades_restantes = bodega - existencias_requeridas;
            System.out.print("No es necesario realizar el pedido al proveedor. Unidades faltantes por vender: " + unidades_restantes);
            if (unidades_restantes < 10) {
                System.out.print(". Alerta generada.");
            }
        }
        entrada.close();
    }
}
