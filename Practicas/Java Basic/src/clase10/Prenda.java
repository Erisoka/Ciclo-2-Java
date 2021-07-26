package clase10;

public class Prenda extends Producto {
    private String talla;
    private boolean seplancha;

    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isSeplancha() {
        return this.seplancha;
    }

    public void setSeplancha(boolean seplancha) {
        this.seplancha = seplancha;
    }

    public void Mostrar() {
        super.Mostrar();
        System.out.println("Talla: " + talla + " - Se plancha? : " + seplancha);
    }

}
