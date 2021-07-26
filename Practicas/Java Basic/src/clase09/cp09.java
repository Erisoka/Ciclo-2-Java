package clase09;

import java.util.Scanner;

import javax.sound.sampled.LineEvent;

public class cp09 {
    public static Scanner leer = new Scanner(System.in);
    public static Prenda prendas[];
    public static Calzado calzados[];

    public static void main(String[] args) {

    }

    // public static void LeerDatos() {
    // System.out.print("Ingrese Número de Prendas a manejar: ");
    // int n = leer.nextInt();
    // prendas = new Prenda[n];

    // for (int i = 0; i < prendas.length; i++) {
    // prendas[i] = new Prenda();
    // System.out.print("Ingrese Código de la Prenda "+(i+1)+": ");
    // prendas[i].setCodigo(leer.nextInt());
    // System.out.print("Ingrese Precio de Compra de la Prenda "+(i+1)+": ");
    // prendas[i].setPrecioCompra(leer.nextFloat());
    // System.out.print("Ingrese Cantidad en Bodega de la Prenda "+(i+1)+": ");
    // prendas[i].setCantidadBodega(leer.nextInt());
    // System.out.print("Ingrese Cantidad Minima Requerida de la Prenda "+(i+1)+":
    // ");
    // prendas[i].setCantidadMinima(leer.nextInt());
    // System.out.print("Ingrese Cantidad Máxima Inventario Permitido de la Prenda
    // "+(i+1)+": ");
    // prendas[i].setCantidadMaxima(leer.nextInt());
    // }
    // }

    public static void LeerPrendas() {
        String entrada;
        String lineas[];
        System.out.print("Ingrese Número de Prendas a manejar: ");
        int n = leer.nextInt();
        prendas = new Prenda[n];
        System.out.println("Ingrese los datos de las prendas separados por espacio:");
        entrada = leer.nextLine(); // salte y se pierde

        for (int i = 0; i < prendas.length; i++) {
            entrada = leer.nextLine();
            lineas = entrada.split(" ");
            prendas[i] = new Prenda();
            prendas[i].setCodigo(Integer.parseInt(lineas[0]));
            prendas[i].setDescripcion(lineas[1]);
            prendas[i].setPrecioCompra(Float.parseFloat(lineas[2]));
            prendas[i].setPrecioVenta(Float.parseFloat(lineas[3]));
            prendas[i].setCantidadBodega(Integer.parseInt(lineas[4]));
            prendas[i].setCantidadMinima(Integer.parseInt(lineas[5]));
            prendas[i].setCantidadMaxima(Integer.parseInt(lineas[6]));
            prendas[i].setTalla(lineas[7]);
            prendas[i].setPlanchado(Boolean.parseBoolean(lineas[8]));
        }
    }

    public static void AlertaPrendas() {
        int may = Integer.MIN_VALUE;
        int id;
        for (int i = 0; i < prendas.length; i++) {
            if (prendas[i].SolicitarPedido()) {
                System.out.println("Alerta! Debe solicitar pedido para la prenda con codigo: " + prendas[i].getCodigo()
                        + " Descripción: " + prendas[i].getDescripcion());
            } else {
                System.out.println("No Debe solicitar pedido para la prenda con codigo: " + prendas[i].getCodigo()
                        + " Descripción: " + prendas[i].getDescripcion());
            }
            if (prendas[i].getCantidadBodega() > may) {
                may = prendas[i].getCantidadBodega();
                id = i;// cod=productos[i].getCodigo()
            }
        }
        int cod = prendas[id].getCodigo();
        System.out.println("El producto con mayor numero de unidades en bodegas es " + prendas[id].getCodigo() + "--> "
                + prendas[id].getDescripcion());
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
        System.out.println("El producto con codigo " + productos[posicion].getCodigo()
                + " con mayor cantidad en bodega: " + productos[posicion].getCantidadBodega());
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
                System.out.println("Total a pagar para el Producto " + productos[i].getCodigo() + " : $" + totalPagar);
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

    public static void VenderProducto() {
        System.out.print("Ingrese el Código del Producto a vender: ");
        int codigo = leer.nextInt();
        System.out.print("Ingrese la cantidad de Productos a vender: ");
        int cantidad = leer.nextInt();

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getCodigo() == codigo) {
                productos[i].CantidadTotalVender(cantidad);
                productos[i].CantidadTotalVenderDescuento(cantidad);
                break;
            }
        }
    }

    public static void Imprimir() {
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Codigo Producto: " + productos[i].getCodigo());
            System.out.println("Precio de compra: " + productos[i].getPrecioCompra());
            System.out.println("Precio de venta: " + productos[i].getPrecioVenta());
            System.out.println("Cantidad en Bodega: " + productos[i].getCantidadBodega());
            System.out.println("Cantidad Mínima: " + productos[i].getCantidadMinima());
            System.out.println("Cantidad Máxima: " + productos[i].getCantidadMaxima());
        }
    }
}

/*
 * codigo prod - precio compra - precio venta - cant bodega - cant min - cant
 * max 9 1 25000 30000 45 30 55 2 3000 3500 15 20 30 3 1500 2000 10 15 25 4 850
 * 1000 60 55 75 5 750 950 70 75 85 6 1500 2000 90 85 110 7 10000 12000 35 40 70
 * 8 75000 80000 55 60 80 9 36500 40000 85 90 120
 */

/*
 * public static void main(String[] args) { int op=1; ReadData(); do{
 * System.out.println("[1]. generar Alertas");
 * System.out.println("[2]. Realizar compras");
 * System.out.println("[3]. Cambia cantidad minima");
 * System.out.println("[4]. Promedio del grupo");
 * System.out.println("[5]. cantiddad d eproductos por debajo de la media");
 * System.out.println("[6]. vender producto");
 * System.out.println("[10]. Salir"); op=leer.nextInt();
 * 
 * switch(op) { case 1: generarAlertas(); break; case 2: realizarCompra();
 * break; case 3: CambiarCantidadminima();; break; case 4: double
 * p=promedioCantidad();
 * System.out.println("promedio de cantidad en bodega es "+p); break; case 5:
 * System.out.println("productos con cantidad por debajo de la media "
 * +productosBajoMedia()); break; case 6: venderProducto(); break; }//endSwitch
 * 
 * 
 * }while(op!=10);
 * 
 * }
 */

 /*
 //--Prendas

6
1 Blusa 25000 30000 45 30 55 M true
2 Jean 3000 3500 15 20 30 M true
3 Pantaloneta 1500 2000 10 15 25 L true
4 Interiores 850 1000 60 55 75 S false
5 Camisa 750 950 70 75 85 XL true
6 Camisilla 1500 2000 90 85 110 L false

----- Calzado----
6
1 Tacones 25000 30000 45 30 55 40
2 Deportivos 85000 90000 15 20 30 39
3 Zandalias 750000 85000 10 15 25 40
4 Chancletas 35000 41000 60 55 75 35
5 Botas 120000 135000 70 75 85 38
6 Zapatillas 55000 65000 15 85 110 42
*/