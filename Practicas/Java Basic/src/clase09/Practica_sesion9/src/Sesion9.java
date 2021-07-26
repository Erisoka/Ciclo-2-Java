import java.util.Scanner;
public class Sesion9 {
    public static Prenda vprenda[];
    public static Calzado vcalzado[];
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
    ReadPrendas();
    ReadShoes();
    generarAlertasPrendas();
    //CambiarCantidadminimaPrenda();    
    //venderPrenda();
    imprimirPrenda();
    imprimirCalzado();
    }//EndMain

//====== imprimir prendas=========
public static  void imprimirPrenda()
{
    int n= vprenda.length;
    for(int i=0;i<n;i++)
    {
        System.out.print("Código "+vprenda[i].getCodigo());
        System.out.print(" Descripcion "+vprenda[i].getDescripcion());
        System.out.print(" Precio de compra "+vprenda[i].getPCompra());
        System.out.print(" Precio de venta "+vprenda[i].getpVenta());
        System.out.print(" Cantidad en Bodega: " + vprenda[i].getCBodega());
        System.out.print(" Cantidad Mínima: " + vprenda[i].getCMinimaRequerida());
        System.out.print(" Cantidad Máxima inventario: " + vprenda[i].getCMaximaPermitida());
        System.out.print(" Talla "+vprenda[i].getTalla());
        System.out.println(" Se plancha? "+vprenda[i].isSeplancha());
    }
}



//====== imprimir Calzado=========
public static  void imprimirCalzado()
{
    int n= vcalzado.length;
    for(int i=0;i<n;i++)
    {
        System.out.print("Código "+vcalzado[i].getCodigo());
        System.out.print(" Descripcion "+vcalzado[i].getDescripcion());
        System.out.print(" Precio de compra "+vcalzado[i].getPCompra());
        System.out.print(" Precio de venta "+vcalzado[i].getpVenta());
        System.out.print(" Cantidad en Bodega: " + vcalzado[i].getCBodega());
        System.out.print(" Cantidad Mínima: " + vcalzado[i].getCMinimaRequerida());
        System.out.print(" Cantidad Máxima inventario: " + vcalzado[i].getCMaximaPermitida());
        System.out.println(" Talla "+vcalzado[i].getTalla());
        
    }
}




    //--- Metodo para leer los datos de prendas
    public static void ReadPrendas()
    {
        System.out.println("Cuantas prendas? ");
        int n= leer.nextInt(); //
        vprenda = new Prenda[n];//creamos el vector
        String entrada;
        String lineas[];
        System.out.println("Digite los productos separados por espacio");   
        leer.nextLine();//salte y se pierda
        for(int i=0;i<n;i++)
        {
         entrada= leer.nextLine(); //1 Blusa 25000 30000 45 30 55 M true 
         lineas=entrada.split(" ");// {"1","Blusa", "25000","30000", "45", "30", "55","M","true"}
         vprenda[i]= new Prenda();
         vprenda[i].setCodigo(Integer.parseInt(lineas[0]));
         vprenda[i].setDescripcion(lineas[1]);
         vprenda[i].setPCompra(Integer.parseInt(lineas[2]));
         vprenda[i].setpVenta(Integer.parseInt(lineas[3]));
         vprenda[i].setCBodega(Integer.parseInt(lineas[4]));
         vprenda[i].setCMinimaRequerida(Integer.parseInt(lineas[5]));
         vprenda[i].setCMaximaPermitida(Integer.parseInt(lineas[6]));
         vprenda[i].setTalla(lineas[7]);
         vprenda[i].setSeplancha(Boolean.parseBoolean(lineas[8]));
         //
        }
    } 

//--- Metodo para leer los datos de zapatos
public static void ReadShoes()
{
    System.out.println("Cuantos zapatos? ");
    int n= leer.nextInt(); //
    vcalzado = new Calzado[n];//creamos el vector
    String entrada;
    String lineas[];
    System.out.println("Digite los productos separados por espacio");   
    leer.nextLine();//salte y se pierda
    for(int i=0;i<n;i++)
    {
     entrada= leer.nextLine(); //1 Tacones 25000 30000 45 30 55 40
     lineas=entrada.split(" ");// {"1","Tacones", "25000","30000", "45", "30", "55","40"}
     vcalzado[i]= new Calzado();
     vcalzado[i].setCodigo(Integer.parseInt(lineas[0]));
     vcalzado[i].setDescripcion(lineas[1]);
     vcalzado[i].setPCompra(Integer.parseInt(lineas[2]));
     vcalzado[i].setpVenta(Integer.parseInt(lineas[3]));
     vcalzado[i].setCBodega(Integer.parseInt(lineas[4]));
     vcalzado[i].setCMinimaRequerida(Integer.parseInt(lineas[5]));
     vcalzado[i].setCMaximaPermitida(Integer.parseInt(lineas[6]));
     vcalzado[i].setTalla(Integer.parseInt(lineas[7]));
     //
    }
} 



  //--- generar las alertas de prendas----------
public static void generarAlertasPrendas()
{
    int n= vprenda.length;
    int may=Integer.MIN_VALUE;
    int id=0;
    int cod;
    for(int i=0;i<n;i++)
    {
        cod=vprenda[i].getCodigo();
        if(vprenda[i].Solicitar())
          System.out.println("Alerta generada para la prenda "+cod+"-->"+vprenda[i].getDescripcion());
        else
        System.out.println("No se solicita prenda "+cod+"-->"+vprenda[i].getDescripcion());

        if(vprenda[i].getCBodega()>may)
         {
             may=vprenda[i].getCBodega();
             id=i;//cod=productos[i].getCodigo()
         }

    }//
    cod=vprenda[id].getCodigo();
    System.out.println("El producto con mayor numero de unidades en bodegas es "+vprenda[id].getCodigo()+"--> "+vprenda[id].getDescripcion());
}

//---Cambiar cantidad mínima de una Prenda
public static void CambiarCantidadminimaPrenda()
{
  int n= vprenda.length;
  System.out.println("Digite el código de la prenda");
  int cp=leer.nextInt();
  System.out.println("Digite La cantidad mínima");
  int cantidad=leer.nextInt();
  for(int i=0;i<n;i++)
  {
    if(vprenda[i].getCodigo()==cp)
    {
        vprenda[i].setCMinimaRequerida(cantidad);
       System.out.println("Cantidad cambiada");
       break;//salga
    }   
  }
}

//----- vender prenda
public static void venderPrenda()
{
    System.out.println("digite el código de la prenda a vender");
    int cp= leer.nextInt();
    System.out.println("Digite cantidad a vender ");
    int cv= leer.nextInt();
    int n=vprenda.length;//tamaño del vector
    for(int i=00;i<n;i++)
    {
        if(vprenda[i].getCodigo()==cp)
        {
            int cb=vprenda[i].getCBodega();
            if(cv<=cb)
            {
                double tvSD=cv*vprenda[i].getpVenta();//2*1000=2000
                double tvCD=tvSD-tvSD*Producto.pDescuento;//2000-2000*0.01=19xxx
                System.out.println("Valor de la factura con descuento "+tvCD);
                System.out.println("Valor de la factura sin descuento "+tvSD);
                vprenda[i].setCBodega(cb-cv);
            }
             else
                System.out.println("no se puede vender no hay la cantidad");
          break;      
        }
    }
}




}//EndClass
