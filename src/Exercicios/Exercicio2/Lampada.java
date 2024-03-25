package Exercicios.Exercicio2;

public class Lampada {

    private Estado estado;
    private int contadorAcendimentos;

    public Lampada() {
        this.estado = Estado.APAGADA;
        this.contadorAcendimentos = 0;
    }

    public void click() {
        if (this.estado == Estado.APAGADA) {
            this.estado = Estado.ACESA;
            contadorAcendimentos++;
        } else {
            this.estado = Estado.APAGADA;
        }
    }

    public int qtdAcendimentos() {
        return contadorAcendimentos;
    }

    public String checaEstado() {
        return "A lâmpada está " + this.estado.toString().toLowerCase() + ".";
    }
}

