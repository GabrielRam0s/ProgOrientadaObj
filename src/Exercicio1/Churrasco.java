package Exercicio1;
public class Churrasco {

    private double qtdCarne;

    public Churrasco() {
        this.qtdCarne = 0;
    }

    public void verificarConsumo(Pessoa pessoa) {
        if (!pessoa.isVegetariana() && pessoa.getIdade() > 3) {
            if (pessoa.getIdade() <= 12) {
                qtdCarne += 1;
            } else {
                qtdCarne += 2;
            }
        }
    }

    public double getQtdCarne() {
        return qtdCarne;
    }

    public void setQtdCarne(double qtdCarne) {
        this.qtdCarne = qtdCarne;
    }
}
