public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", "Masculino", 15, false);
        Pessoa p2 = new Pessoa("Maria", "Feminino", 10, false);
        Pessoa p3 = new Pessoa("Ana", "Feminino", 2, false);
        Pessoa p4 = new Pessoa("Carlos", "Masculino", 20, true); // Vegetariano

        Churrasco churrasco = new Churrasco();

        churrasco.verificarConsumo(p1);
        churrasco.verificarConsumo(p2);
        churrasco.verificarConsumo(p3);
        churrasco.verificarConsumo(p4);

        System.out.println("Quantidade total de carne: " + churrasco.getQtdCarne() + " kg");
    }
}
