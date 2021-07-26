package clase10;

public class Producto {
    private int codigo;
    private String descripcion;
    private int pCompra;
    private int pVenta;
    private int cBodega;
    private int cMinimaRequerida;
    private int cMaximaPermitida;
    static double pDescuento = 0.01;

    public boolean Solicitar() {
        if (cBodega < cMinimaRequerida)
            return true;
        else
            return false;
    }

    public double totalAPagar(int unidades) {
        int subtotal = unidades * pCompra;
        double descuento = subtotal * pDescuento;
        double total = subtotal - descuento;
        return total;
    }

    public int getpVenta() {
        return pVenta;
    }

    public void setpVenta(int pv) {
        pVenta = pv;
    }

    public void setDescripcion(String des) {
        descripcion = des;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPCompra() {
        return this.pCompra;
    }

    public void setPCompra(int pCompra) {
        this.pCompra = pCompra;
    }

    public int getCBodega() {
        return this.cBodega;
    }

    public void setCBodega(int cBodega) {
        this.cBodega = cBodega;
    }

    public int getCMinimaRequerida() {
        return this.cMinimaRequerida;
    }

    public void setCMinimaRequerida(int cMinimaRequerida) {
        if (cMinimaRequerida < 0)
            this.cMinimaRequerida = 0;
        else
            this.cMinimaRequerida = cMinimaRequerida;
    }

    public int getCMaximaPermitida() {
        return this.cMaximaPermitida;
    }

    public void setCMaximaPermitida(int cMaximaPermitida) {
        this.cMaximaPermitida = cMaximaPermitida;
    }

    public void Mostrar() {
        System.out.println("Codigo: "+codigo + " - Descripción: " + descripcion + " - Precio de Compra: " + pCompra + " - Precio de Venta: $" + pVenta + " - Cantidad en Bodega: " + cBodega + " - Cantidad mínima requerida: "
                + cMinimaRequerida + " - Cantidad Máxima Permitida: " + cMaximaPermitida);
    }

}
