package clase01;

import java.util.Scanner;

public class ejemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int bodega, existencias_requeridas;
        System.out.print("Ingrese la candtidad en bodega: ");
        bodega = entrada.nextInt();
        System.out.print("Ingrese la candtidad minima requerida: ");        
        existencias_requeridas = entrada.nextInt();
        if (bodega < existencias_requeridas) {
            System.out.print("Debe realizar el pedido al proveedor.");
        } else {
            int unidades_vener = bodega - existencias_requeridas;
            if (unidades_vener < 10) {
                System.out.print("No es necesario realizar el pedido.");
            }
            System.out.print("No es necesario realizar el pedido al proveedor.");
        }
        entrada.close();
    }
}
