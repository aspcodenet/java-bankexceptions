public class BankAccount {
    private int balance;
    private String accountNo;

    public String getAccountNo() {
        return accountNo;
    }

    public BankAccount(String accountNo){
        if(accountNo ==  null || accountNo.length() == 0){ 
            throw new IllegalArgumentException("Kontonummer tack");
        }
        this.accountNo = accountNo;
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    // Returnera enum

    public void Withdraw(int amount) throws AmountHigherThanBalanceException, AmountHigherThanDailyLimitException{
        if(amount > balance) {
            throw new AmountHigherThanBalanceException("Amount higher than balance");
        }
        if(amount > 3000){
            throw new AmountHigherThanDailyLimitException("Amount higher than per withdrawal limit");
        }
        balance -= amount;
    }

    public void Deposit(int amount){
        balance += amount;
    }
}
