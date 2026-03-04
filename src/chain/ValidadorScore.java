package chain;

import model.Loan;

public class ValidadorScore extends Validador {
    @Override
    public boolean validar(Loan emprestimo) {

        if (emprestimo.getScore() <= 600) {//olha o score da pessoa
            System.out.println("Score baixo");
            return false;
        }
        if (proximo != null) {
            return proximo.validar(emprestimo);
        }

        return true;
    }
}
