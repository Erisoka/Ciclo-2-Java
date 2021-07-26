package clase09;

public class Producto {
    private int codigo;
    private String descripcion;    
    private float precioCompra;
    private float precioVenta;
    private int cantidadBodega;
    private int cantidadMinima;
    private int cantidadMaxima;
    static float porcentajeDescuento = 0.01f;
    
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecioCompra() {
        return this.precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
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
        if (cantidadMinima <= 0) {
            this.cantidadMinima = 0;
        } else {
            this.cantidadMinima = cantidadMinima;
        }
    }

    public int getCantidadMaxima() {
        return this.cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public boolean SolicitarPedido() {
        if (cantidadBodega < cantidadMinima) {
            return true;
        } else {
            return false;
        }
    }

    public float CantidadTotalPagar(int unidadesComprar) {
        float subtotal = precioCompra * unidadesComprar;
        float descuento = subtotal * porcentajeDescuento;
        float total = subtotal - descuento;
        return total;
    }

    public void CantidadTotalVender(int unidadesVender) {
        if (unidadesVender < cantidadBodega) {
            float total = precioVenta * unidadesVender;
            cantidadBodega -= unidadesVender;
            System.out.println("Valor de la factura sin descuento: $" + total);
        } else {
            System.out.println("No se puede vender, no hay cantidad suficiente en bodega!");
        }
    }

    public void CantidadTotalVenderDescuento(int unidadesVender) {
        if (unidadesVender < cantidadBodega) {
            float subtotal = precioVenta * unidadesVender;
            float descuento = subtotal * porcentajeDescuento;
            float total = subtotal - descuento;
            cantidadBodega -= unidadesVender;
            System.out.println("Valor de la factura con descuento: $" + total);
        } else {
            System.out.println("No se puede vender, no hay cantidad suficiente en bodega!");
        }
    }
}
