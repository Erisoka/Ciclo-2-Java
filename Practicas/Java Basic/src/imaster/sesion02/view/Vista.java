package imaster.sesion02.view;

import imaster.sesion02.model.Wallet;

public class Vista {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        System.out.println(wallet1.saveMoney(300000));
        System.out.println(wallet1.getSaldo());
    }
}
