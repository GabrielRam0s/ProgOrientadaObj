package Exercicios.Exercicio9;
import Exercicios.Exercicio4.*;

public class Transferencia{
    private Cliente remetente;
    private double saldoTransferencia;
    private int idOperacao;
    static int numeradorOperacao;

    public Transferencia(Cliente remetente){
        this.remetente = remetente;
        this.saldoTransferencia = remetente.checarSaldo();
        idOperacao = numeradorOperacao++;
    }

    public void transferir(Cliente destinatario, double valor){
        if(saldoTransferencia >= valor){
            remetente.sacar(valor, false);
            destinatario.depositar(valor, false);

            System.out.println("***************TRANSFERÊNCIA***************");
            System.out.println("TRANSFERÊNCIA REALIZADA COM SUCESSO");
            System.out.println("NOME DO REMETENTE: "+remetente.obterNome());
            System.out.println("NOME DO DESTINATÁRIO: "+destinatario.obterNome());
            System.out.println("VALOR REMETIDO: R$"+valor);
            remetente.extrato();
            System.out.println("*******************************************");
            return;
        }

        System.out.println("***************TRANSFERÊNCIA***************");
        System.out.println("TRANSFERẼNCIA NÃO FOI REALIZADA!");
        System.out.println("SALDO INSUFICIENTE");
        remetente.extrato();
        System.out.println("*******************************************");
    }

}
