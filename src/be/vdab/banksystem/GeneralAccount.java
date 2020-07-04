package be.vdab.banksystem;

public abstract class GeneralAccount {

    private int totalamount;
    private int transferBudget;
    private String accountName;
    private int owner;

    public GeneralAccount(int totalamount) {
        this.totalamount = totalamount;

    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int transferMoney(){
        return transferBudget;
    }

    public int getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public int getTransferBudget() {
        return transferBudget;
    }

    public void setTransferBudget(int transferBudget) {
        this.transferBudget = transferBudget;
    }
}
