package Exercicios.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel Ramos", 1000.0, 500.0);

        System.out.println("Cliente: " + cliente.obterNome());
        System.out.println("Saldo inicial: " + cliente.checarSaldo());

        if (!cliente.sacar(1600)) {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
        }

        if (cliente.sacar(1500)) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }

        System.out.println("Saldo após saque: " + cliente.checarSaldo());

        cliente.depositar(200);
        System.out.println("Saldo após depósito: " + cliente.checarSaldo());
    }
}
