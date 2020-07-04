package be.vdab.banksystem;

public class CurrentAccount extends GeneralAccount{
    private int amountOnCurrentAccount;
    private SavingsAccount savings1 = new SavingsAccount();

    public CurrentAccount(int totalamount) {
        super(totalamount);
    }

    public CurrentAccount(int totalamount, int amountOnCurrentAccount, int totalAmountOnSavings) {
        super(totalamount = amountOnCurrentAccount + totalAmountOnSavings);
        this.amountOnCurrentAccount = amountOnCurrentAccount;
        this.totalAmountOnSavings = totalAmountOnSavings;
    }

    public int getAmount() {
        return amountOnCurrentAccount;
    }

    public void setAmount(int amount) {
        this.amountOnCurrentAccount = amount;
    }
}
