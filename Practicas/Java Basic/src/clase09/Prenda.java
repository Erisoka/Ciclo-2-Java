package clase09;

public class Prenda extends Producto {
    private String talla;
    private boolean planchado;

    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isPlanchado() {
        return this.planchado;
    }

    public void setPlanchado(boolean planchado) {
        this.planchado = planchado;
    }

}
