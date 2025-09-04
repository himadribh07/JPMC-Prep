package SystemDesign;


abstract class Transaction{
    int transactionId;
    abstract void execute();
}

class BalanceInquiryTransaction extends Transaction{
    Account account;

    public void execute(){
        System.out.println("Balance: "+ account.getBalance());
    }
}

class DepositTransaction extends Transaction{
    Account account;
    double amount;

    public void execute(){
        account.debit(amount);
    }
}

class WithdrawTransaction extends Transaction{
    Account account;
    double amount;

    public void execute(){
        account.credit(amount);
    }
}


class ATM{
    private Account account;
    private Card card;

    public void performTransaction(Transaction t){
        t.execute();
    }
}

class Account{
    private String accountNumber;
    private double balance;

    public Account(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void debit(double amt){
        if(balance>=amt)
            balance-=amt;
    }

    public void credit(double amt){
        balance+=amt;
    }
}

class Card{
    private String cardNumber;
    private int pin;

    public boolean validate(int enteredPin){
        return this.pin==enteredPin;
    }
}

