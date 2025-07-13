package dev.uelquis.banco_digital;

public class Main {
    public static void main(String... agrs) {
        Cliente venilton = new Cliente("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
