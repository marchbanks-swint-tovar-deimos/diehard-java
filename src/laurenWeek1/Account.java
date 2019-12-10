package laurenWeek1;

// Account that withdraws and deposits money
//The debit(withdraw) amount should not exceed the balance. (Leave the balance alone and throw an error)
public class Account {
    private double balance;

    public Account(double initialBalance){
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }
    public void credit (double amount){
        balance = balance + amount;
    }
    public void debitCard(double amount){
        balance = balance - amount;
    }
    public double getBalance(){
        return balance;
    }
}
