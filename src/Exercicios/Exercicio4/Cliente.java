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

    protected Cliente(){
    }

    public void sacar(double quantia, boolean mostrarMensagem) {
        if (quantia <= checarSaldo()) {
            saldo -= quantia;
            if(mostrarMensagem){
                System.out.println("*******************SAQUE*******************");
                System.out.println(obterNome()+", saque de R$" + quantia + " foi realizado com sucesso.");
                extrato();
                System.out.println("*******************************************");
            }
        } else if (mostrarMensagem) {
            System.out.println("*******************SAQUE*******************");
            System.out.println(obterNome()+ ", não foi possível realizar o saque de R$"+quantia+". Saldo insuficiente.");
            extrato();
            System.out.println("*******************************************");
        }
    }

    public void depositar(double quantia, boolean mostrarMensagem) {
        saldo += quantia;
        if(mostrarMensagem){
            System.out.println("****************DEPÓSITO*******************");
            System.out.println(obterNome()+", depósito de R$" + quantia+ " foi realizado com sucesso.");
            extrato();
            System.out.println("*******************************************");
        }
            
    }


    public double checarSaldo() {
        return saldo + limite;
    }

    public String obterNome() {
        return this.nome;
    }

    public void extrato(){
        System.out.println("-----------------EXTRATO----------------");
        System.out.println("NOME DO TITULAR: "+obterNome());
        System.out.println("SALDO: R$"+saldo);
        System.out.println("LIMITE DE CRÉDITO: R$"+limite);
        System.out.println("----------------------------------------");
    }
}
