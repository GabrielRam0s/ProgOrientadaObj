package Exercicios.Exercicio12;


public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Leandro", "46809818812");
        cliente1.adicionarTelefone("13", "997164030");
        cliente1.mostrarDados();
    }
}
