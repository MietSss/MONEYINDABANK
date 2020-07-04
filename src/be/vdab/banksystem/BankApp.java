package be.vdab.banksystem;

public class BankApp {


    public static void main(String[] args) {
        Person jos = new Person("Jos DenOS", 37);
        CurrentAccount accountOfJos = new CurrentAccount( 1500,"Jos den Os");
        SavingsAccount savingsAccount = new SavingsAccount(1500);

        accountOfJos.getAmountOnCurrentAccount();
        accountOfJos.getSavingsAccount();

        System.out.println(accountOfJos.getAmountOnCurrentAccount());


        // interest berekenen

        System.out.println(savingsAccount.calculateIntrest(savingsAccount.getTotalAmountOnSavings(),savingsAccount.getInterestRate(),savingsAccount.getYearsOfInterest()));

    }
}
