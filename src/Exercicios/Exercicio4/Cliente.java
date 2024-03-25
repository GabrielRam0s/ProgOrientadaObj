package Exercicios.Exercicio4;

public class Cliente {

    private String nome;
    private double saldo;
    private double limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean sacar(double quantia) {
        if (quantia <= (saldo + limite)) {
            saldo -= quantia;
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
