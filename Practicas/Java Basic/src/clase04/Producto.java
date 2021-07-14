package clase04;

public class Producto {
    int Codigo;
    float precioCompra;
    int cantidadBodega;
    int cantidadMinima;

    public boolean SolicitarPedido() {
        if (cantidadBodega < cantidadMinima) {
            return true;
        } else {
            return false;
        }
    }
}
