import chain.Validador;
import chain.ValidadorRenda;
import chain.ValidadorScore;
import chain.ValidadorValor;
import model.Loan;

public class Main {
    public static void main(String[] args) {

        ValidadorValor validador = new ValidadorValor();
        ValidadorRenda validadorRenda = new ValidadorRenda();
        ValidadorScore validadorScore = new ValidadorScore();

        validador.setProximo(validadorRenda);
        validadorRenda.setProximo(validadorScore);

        Loan loan = new Loan("Miguel", 5000, 650, 3000);
        Loan loan2 = new Loan("Marina", 2900, 540, 1500);

        boolean resultado = validador.validar(loan);
        boolean resultado2 = validador.validar(loan2);

        if (resultado) {
            System.out.println("Emprestimo aprovado!");
        }
        else{
            System.out.println("Emprestimo reprovado!");
        }

        System.out.println("---------------------------");

        if (resultado2) {
            System.out.println("Emprestimo aprovado!");
        }
        else{
            System.out.println("Emprestimo reprovado!");
        }
    }
}