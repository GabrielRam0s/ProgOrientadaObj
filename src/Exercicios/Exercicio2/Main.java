package Exercicios.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        System.out.println(lampada.checaEstado());
        lampada.click();
        System.out.println(lampada.checaEstado());
        lampada.click();
        System.out.println(lampada.checaEstado());
        lampada.click();
        System.out.println(lampada.checaEstado());

        System.out.println("A lâmpada foi acesa " + lampada.qtdAcendimentos() + " vezes.");
    }
}
