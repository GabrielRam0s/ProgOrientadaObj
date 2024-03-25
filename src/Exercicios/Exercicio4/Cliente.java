package Exercicios.Exercicio4;

public class Cliente {

    private String nome;
    private double saldo;
    private double limite;

    // Construtor
    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean sacar(double quantia) {
        double saldoTotal = saldo + limite;
        if (quantia <= saldoTotal) {
            if (quantia <= saldo) {
                saldo -= quantia;
            } else {
                double restante = quantia - saldo;
                saldo = 0;
                limite -= restante;
            }
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public double checarSaldo() {
        return saldo + limite;
    }

    public String obterNome() {
        return nome;
    }
}
