package imaster.sesion02.model;

public class Wallet {
    
    public static final int CAPACIDAD_MAXIMA =  1000000;
    private int saldo;
    private boolean tieneLimite;

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;
    }

    public int getSaldo(){
        return saldo;
    }

    public String saveMoney(int valor) {
        if (valor < 0) {
            return "Debe digitar una cantidad válida.";
        }
        if (tieneLimite && valor+saldo > CAPACIDAD_MAXIMA) {
            return "El saldo no debe superar la capacidad máxima";
        }
        saldo += valor;
        return "Transacción exitosa! Su nuevo saldo es: $"+ saldo;
    }

    public String takeMoney(int valor) {
        if (saldo < valor) {
            return "No tiene saldo suficiente.";
        }
        saldo -= valor;
        return "Transacción exitosa! Su nuevo saldo es: $" + saldo;
    }

}
