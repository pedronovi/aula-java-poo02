package entities;

public class bankAccount {
    private int accountNum;
    private String accountOwner;
    private double initialDeposit;
    private double moneyInAccount;

    // CONSTRUTORES
    public bankAccount(int accountNum, String accountOwner, double initialDeposit) {
        this.moneyInAccount = initialDeposit;
        this.accountNum = accountNum;
        this.accountOwner = accountOwner;

    }

    public bankAccount(int accountNum, String accountOwner) {
        this.accountNum = accountNum;
        this.accountOwner = accountOwner;
    }

    public bankAccount(){
    }



    // GETTERS AND SETTERS
    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public double getMoneyInAccount() {
        return moneyInAccount;
    }

    public void setMoneyInAccount(double moneyInAccount) {
        this.moneyInAccount = moneyInAccount;
    }

    // Criando toString

    public String toString(){
        return "Account "
                + getAccountNum()
                + ", Holder: "
                + getAccountOwner()
                + ", Balance: $ "
                + String.format("%.2f%n", getMoneyInAccount());
    }




    // Criando functions

    public void depositValue(double deposit){
        moneyInAccount += deposit;
    }

    public void withdrawValue(double withdraw){
        moneyInAccount = (moneyInAccount - 5.0) - withdraw;
    }


}
