package day41_Inheritance;

public class BankAccountObject {
    public static void main(String[] args) {
    BankAccount Jack =new BankAccount("Jack","Mister");

    // System.out.println(Jack.accountHolder());
        System.out.println(Jack.getAccountHolder());
        System.out.println(Jack.getBalance());

        Jack.checkBalance();
        Jack.depositing(120);

        Jack.checkBalance();

        Jack.withdrawing(80);
        Jack.checkBalance();


        System.out.println(Jack);

        Jack.withdrawing(100);

        System.out.println(Jack);










    }


}
