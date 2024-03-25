package Exercicios.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        System.out.println("Estado inicial: " + lampada.checaEstado());
        lampada.click();
        System.out.println("Estado após 1º click: " + lampada.checaEstado());
        lampada.click();
        System.out.println("Estado após 2º click: " + lampada.checaEstado());
        System.out.println("Quantidade de acendimentos: " + lampada.qtdAcendimentos());
    }
}
