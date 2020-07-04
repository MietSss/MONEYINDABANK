package be.vdab.banksystem;

public abstract class GeneralAccount {

    private int transferBudget;
    private String accountName;
    private String owner;


    public GeneralAccount() {

    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int transferMoney(){
        return transferBudget;
    }


    public int getTransferBudget() {
        return transferBudget;
    }

    public void setTransferBudget(int transferBudget) {
        this.transferBudget = transferBudget;
    }

}
