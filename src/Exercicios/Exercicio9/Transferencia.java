package Exercicios.Exercicio9;
import Exercicios.Exercicio4.*;

public class Transferencia {

    public static void transferir( Cliente remetente, Cliente destinatario, double valor){
        if(remetente.checarSaldo() >= valor){
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
