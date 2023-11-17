package pl.gornik.bank;

public class BankAccount {
    private String numberAccount;

    private double accountBalance;

    public BankAccount(String numberAccount, double accountBalance) {
        if(numberAccount.length() == 26) {
            this.numberAccount = numberAccount;
        }else if (numberAccount.length() < 26){
            int size = numberAccount.length();
            for(int i = 0; i < 26 - size; i++){
                numberAccount += "0";
            }
            this.numberAccount = numberAccount;
        }
        if (accountBalance >= 0) {
            this.accountBalance = accountBalance;
        }
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance >= 0) {
            this.accountBalance = accountBalance;
        }
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void payCheck(double amount) {
        accountBalance += amount;
    }

    @Override
    public String toString() {
        return "Numer konta: " + numberAccount + " , saldo: " + accountBalance;
    }
}

