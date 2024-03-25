package Exercicios.Exercicio12;

public class Cliente {
    private String nome, cpf;
    private Telefone telefone;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    void mostrarDados(){
        System.out.println("DADOS DO CLIENTE");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone.obterDDD() + telefone.obterNumero());
    }
    
    void adicionarTelefone(String ddd, String telefone){
        this.telefone = new Telefone(ddd, telefone);
    }
}
