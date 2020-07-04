package be.vdab.banksystem;

public class CurrentAccount extends GeneralAccount{
    private int amount;
    private SavingsAccount savings1 = new SavingsAccount("savings1");

    public CurrentAccount(int totalamount, int amount) {
        super(totalamount);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
