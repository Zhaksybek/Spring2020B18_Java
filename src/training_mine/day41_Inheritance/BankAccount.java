package training_mine.day41_Inheritance;

public class BankAccount {

    public long accountNumber;
    public String accountHolder;
    public  double balance;


    public void deposit(int amount){
        balance += amount;
    }

    public void showBalance(){
        System.out.println("Available balance: "+balance);
    }

    public String toString(){
    return "Name: "+accountHolder+", balance: "+balance;
    }




}
