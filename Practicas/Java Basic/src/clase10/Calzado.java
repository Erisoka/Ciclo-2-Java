package clase10;

public class Calzado extends Producto {
    private int talla;

    public int getTalla() {
        return this.talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void Mostrar() {
        super.Mostrar();
        System.out.println("Talla: "+ talla);
    }

}
