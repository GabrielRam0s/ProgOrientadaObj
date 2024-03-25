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

    public void sacar(double quantia, boolean mostrarMensagem) {
        if (quantia <= checarSaldo()) {
            if (quantia <= saldo) {
                saldo -= quantia;
            } else {
                limite -= quantia - saldo;
                saldo = 0;
            }
            if(mostrarMensagem){
                System.out.println(obterNome()+", saque de R$" + quantia + " foi realizado com sucesso. Seu novo saldo: R$"+checarSaldo());
            }
        } else if (mostrarMensagem) {
            System.out.println(obterNome()+ ", não foi possível realizar o saque de R$"+quantia+". Saldo insuficiente. Seu saldo atual é R$"+checarSaldo());
        }
    }

    public void depositar(double quantia, boolean mostrarMensagem) {
        saldo += quantia;
        if(mostrarMensagem){
            System.out.println(obterNome()+", depósito de R$" + quantia+ " foi realizado com sucesso. Seu novo saldo é: R$"+checarSaldo());
        }
            
    }


    public double checarSaldo() {
        return saldo + limite;
    }

    public String obterNome() {
        return nome;
    }

    public void extrato(){
        System.out.println("-----------------EXTRATO----------------");
        System.out.println("NOME DO TITULAR: "+obterNome());
        System.out.println("SALDO: R$"+checarSaldo());
        System.out.println("----------------------------------------");
    }
}
