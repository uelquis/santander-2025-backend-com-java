package dev.uelquis.conta_banco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        var scanner = new Scanner(System.in);

        System.out.println("Insira o número da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Insirea a agência:");
        agencia = scanner.next();

        System.out.println("Insira o seu primeiro nome:");
        nomeCliente = scanner.next();

        System.out.println("Insira o seu último nome:");
        nomeCliente = nomeCliente.concat(" " + scanner.next());

        System.out.println("Insira seu saldo:");
        saldo = scanner.nextFloat();

        System.out.printf("""
            Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,
            conta %d e seu saldo %.2f já está disponível para saque!
            """, nomeCliente, agencia, numeroConta, saldo);

        scanner.close();

    }
}
