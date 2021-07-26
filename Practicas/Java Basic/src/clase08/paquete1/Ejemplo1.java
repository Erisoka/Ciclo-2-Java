package clase08.paquete1;

public class Ejemplo1 {
    private int atributo;
    public int atributo2;

    public Ejemplo1(){
        atributo = 1;
        atributo2 = 2;
    }

    public int getAtributo() {
        return this.atributo;
    }

    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }

}

class Ejemplo2 {
    public void mostar() {
        Ejemplo1 ob = new Ejemplo1();
        System.out.println("Atributo: " + ob.getAtributo() + " Atributo 2: " + ob.atributo2);  
    }
}
