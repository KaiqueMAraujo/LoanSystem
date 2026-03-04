package chain;

import model.Loan;

public class ValidadorRenda extends Validador {

    @Override
    public boolean validar(Loan emprestimo){

        if(emprestimo.getMonthlyIncome() <= 2000){//pede a renda
            System.out.println("Renda insuficiente");
            return false;
        }
        if (proximo != null) {
            return proximo.validar(emprestimo);
        }

        return true;
    }



}
