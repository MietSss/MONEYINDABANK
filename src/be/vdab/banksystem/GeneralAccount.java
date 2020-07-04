package be.vdab.banksystem;

public abstract class GeneralAccount {
    private int totalamount;
    private int transferBudget;

    public GeneralAccount(int totalamount) {
        this.totalamount = totalamount;

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
