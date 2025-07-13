package dev.uelquis.banco_digital;

public interface IConta {
    int AGENCIA_PADRAO = 1;

    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
}
