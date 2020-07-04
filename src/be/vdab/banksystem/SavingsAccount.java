package be.vdab.banksystem;

public class SavingsAccount extends CurrentAccount {

    private int totalAmountOnSavings;
    private int intrest;
    private int yearsOfInterest;
    private int interestRate;
    private int amountForTransfer;


    public SavingsAccount(int totalAmountOnSavings) {
        super();
        this.totalAmountOnSavings = totalAmountOnSavings;
    }

    public int getYearsOfInterest() {
        return yearsOfInterest;
    }

    public void setYearsOfInterest(int yearsOfInterest) {
        this.yearsOfInterest = yearsOfInterest;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
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
