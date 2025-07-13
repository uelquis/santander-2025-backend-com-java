package dev.uelquis.banco_digital;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 0;

    @Getter @Setter
    protected int agencia;

    @Getter @Setter
    protected int numero;

    @Getter @Setter
    protected double saldo;

    @NonNull @Getter @Setter
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Titular: %s \n", this.cliente.getNome());
        System.out.printf("Agencia: %d \n", this.agencia);
        System.out.printf("Numero: %d \n", this.numero);
        System.out.printf("Saldo: %.2f \n", this.saldo);
    }
}
