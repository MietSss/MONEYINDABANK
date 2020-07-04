package be.vdab.banksystem;

public class CurrentAccount extends GeneralAccount{
    private int amountOnCurrentAccount;
    private SavingsAccount savingsAccount = new SavingsAccount(0);
    private String owner;

    public CurrentAccount() {

    }

    public int getAmountOnCurrentAccount() {
        return amountOnCurrentAccount;
    }

    public CurrentAccount(int amountOnCurrentAccount, String owner) {
        this.amountOnCurrentAccount = amountOnCurrentAccount;
        this.owner = owner;
    }

    public void setAmountOnCurrentAccount(int amountOnCurrentAccount) {
        this.amountOnCurrentAccount = amountOnCurrentAccount;
    }


    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
