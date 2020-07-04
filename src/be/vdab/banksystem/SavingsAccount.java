package be.vdab.banksystem;

public class SavingsAccount {

    private int totalAmountOnSavings;
    private int intrest;
    private int yearsOfInterest;
    private int interestRate;
    private int amountForTransfer;


    public SavingsAccount(String nameAccount, int totalAmountOnSavings) {
    }

    public SavingsAccount(int totalAmountOnSavings) {
        this.totalAmountOnSavings = totalAmountOnSavings;
    }

    public SavingsAccount() {

    }

    public int getBudgetSavings() {
        return totalAmountOnSavings;
    }

    public void setBudgetSavings(int budgetSavings) {
        this.totalAmountOnSavings = budgetSavings;
    }

    public int transferToCurrentAccount() {
        return amountForTransfer;
    }

    public int getTotalAmountOnSavings() {
        return totalAmountOnSavings;
    }

    public void setTotalAmountOnSavings(int totalAmountOnSavings) {
        this.totalAmountOnSavings = totalAmountOnSavings;
    }

    public int getAmountForTransfer() {
        return amountForTransfer;
    }

    public void setAmountForTransfer(int amountForTransfer) {
        this.amountForTransfer = amountForTransfer;
    }

    public int getIntrest() {
        return intrest;
    }

    public void setIntrest(int intrest) {
        this.intrest = intrest;
    }

    public int calculateIntrest(int totalAmountOnSavings, int interestRate, int yearsOfInterest){
        int intrest = totalAmountOnSavings * interestRate * yearsOfInterest;
        totalAmountOnSavings = intrest;
        return totalAmountOnSavings;
    }
}
