package model;

public class Loan {

    private String nome;
    private double valueLoan;
    private int score;
    private double monthlyIncome;

    public Loan(String nome, double valueLoan, int score, double monthlyIncome) {
        this.nome = nome;
        this.valueLoan = valueLoan;
        this.score = score;
        this.monthlyIncome = monthlyIncome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValueLoan() {
        return valueLoan;
    }

    public void setValueLoan(double valueLoan) {
        this.valueLoan = valueLoan;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}
