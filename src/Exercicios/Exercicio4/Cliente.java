package Exercicios.Exercicio4;

public class Cliente {
    // Atributos
    private String nome;
    private double saldo;
    private double limite;

    // Construtor
    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    // Método para sacar uma quantia do saldo
    public boolean sacar(double quantia) {
        double saldoTotal = saldo + limite;
        if (quantia <= saldoTotal) {
            if (quantia <= saldo) {
                saldo -= quantia; // Atualiza o saldo subtraindo a quantia sacada
            } else {
                double restante = quantia - saldo;
                saldo = 0; // Saldo fica zerado
                limite -= restante; // Desconta o restante do limite
            }
            return true; // Saque realizado com sucesso
        } else {
            return false; // Saque não realizado, valor excede o saldo + limite
        }
    }

    // Método para depositar uma quantia no saldo
    public void depositar(double quantia) {
        saldo += quantia;
    }

    // Método para checar o saldo (saldo + limite)
    public double checarSaldo() {
        return saldo + limite;
    }

    // Método para obter o nome do cliente
    public String obterNome() {
        return nome;
    }
}
