package training_mine.CustomClass;

public class BancAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public void chekingBalance(){
        System.out.println("Available BAlance "+balance);
    }

    public void withDraw(double amount){
        System.out.println("Withdrawing $"+amount);
        balance-=amount;
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;
    }

    public String toString(){
        String result="Account Holder: "+ accountHolder+"\nAccount Number: "+accountNumber
                +"\nAvailable balance "+balance;
        return result;
    }

}
