package Exercicios.Exercicio2;

public class Lampada {
    private Estado estado;
    private int qtdAcendimentos;

    public Lampada() {
        this.estado = Estado.APAGADA; // Estado inicial
    }

    public void click() {
        if (this.estado == Estado.ACESA) {
            this.estado = Estado.APAGADA;
        } else {
            this.estado = Estado.ACESA;
            qtdAcendimentos++;
        }
    }

    public int qtdAcendimentos() {
        return qtdAcendimentos;
    }

    public Estado checaEstado() {
        return estado;
    }
}

