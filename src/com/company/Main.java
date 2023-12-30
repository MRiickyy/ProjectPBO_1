package com.company;

// Kelas untuk mengelola saldo
class EWallet {
    private double saldo;

    public EWallet() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void topUp(double amount) {
        // Simulasi penambahan saldo
        saldo += amount;
        System.out.println("Top-up berhasil. Saldo sekarang: " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        EWallet eWallet = new EWallet();

        // Simulasi top-up
        double topUpAmount = 50.0;
        eWallet.topUp(topUpAmount);

        // Simulasi menampilkan saldo
        System.out.println("Saldo sekarang: " + eWallet.getSaldo());
    }
}

