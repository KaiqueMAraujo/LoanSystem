package chain;

import model.Loan;

public class ValidadorValor extends Validador{

    @Override
    public boolean validar(Loan emprestimo){

        if(emprestimo.getValueLoan() <= 0){
            System.out.println("valor invalido");
            return false;
        }
        if (proximo != null) {
            return proximo.validar(emprestimo);
        }

        return true;
    }

}
