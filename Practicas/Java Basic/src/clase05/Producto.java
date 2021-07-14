package clase05;

public class Producto {
    private int codigo;
    private int precioCompra;
    private int cantidadBodega;
    private int cantidadMinima;

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioCompra() {
        return this.precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadBodega() {
        return this.cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinima() {
        return this.cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public boolean solicitarPedido() {
        if (cantidadBodega < cantidadMinima) {
            return true;
        } else {
            return false;
        }
    }

    public void datosProducto() {
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Precio Compra: "+this.getPrecioCompra());
        System.out.println("Cantidad en Bodega: "+this.getCantidadBodega());
        System.out.println("Cantidad Minima: "+this.getCantidadMinima());
    }

}
