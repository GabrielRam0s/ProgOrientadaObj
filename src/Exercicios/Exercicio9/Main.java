package Exercicios.Exercicio9;
import Exercicios.Exercicio4.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel Ramos", 1000.0, 500.0);
        Cliente cliente2 = new Cliente("Leandro Santos", 500, 100);

        cliente1.sacar(1600, true);
        cliente1.sacar(1500, true);

        cliente1.depositar(200, true);

        Transferencia.transferir(cliente2, cliente1, 202);
        cliente2.sacar(350, true);

        Transferencia.transferir(cliente1, cliente2, 500);


    }
}
