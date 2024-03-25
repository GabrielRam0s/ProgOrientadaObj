package Exercicios.Exercicio9;
import Exercicios.Exercicio4.*;

public class Transferencia extends Cliente{
    private double saldoTransferencia;
    public int idOperacao;
    static int numeradorOperacao;

    public Transferencia(Cliente remetente){
        this.saldoTransferencia = super.checarSaldo();
        idOperacao = numeradorOperacao++;
    }

    public void transferir(Cliente destinatario, double valor){
        if(saldoTransferencia >= valor){
            super.sacar(valor, false);
            destinatario.depositar(valor, false);

            System.out.println("***************TRANSFERÊNCIA***************");
            System.out.println("TRANSFERÊNCIA REALIZADA COM SUCESSO");
            System.out.println("NOME DO REMETENTE: "+super.obterNome());
            System.out.println("NOME DO DESTINATÁRIO: "+destinatario.obterNome());
            System.out.println("VALOR REMETIDO: R$"+valor);
            super.extrato();
            System.out.println("*******************************************");
            return;
        }

        System.out.println("***************TRANSFERÊNCIA***************");
        System.out.println("TRANSFERẼNCIA NÃO FOI REALIZADA!");
        System.out.println("SALDO INSUFICIENTE");
        super.extrato();
        System.out.println("*******************************************");
    }

}
