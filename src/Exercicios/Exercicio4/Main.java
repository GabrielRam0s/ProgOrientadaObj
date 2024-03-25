package Exercicios.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel Ramos", 1000.0, 500.0);

        cliente1.sacar(1600, true);
        cliente1.sacar(1500, true);

        cliente1.depositar(200, true);
    }
}
