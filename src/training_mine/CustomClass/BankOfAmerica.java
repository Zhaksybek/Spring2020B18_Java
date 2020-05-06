package training_mine.CustomClass;



public class BankOfAmerica {

    public static void main(String[] args) {
        BancAccount Jack =new BancAccount();

        Jack.accountHolder ="Jack";
        Jack.accountNumber = 123456;

        Jack.chekingBalance();
        Jack.deposit(300);

        Jack.chekingBalance();

        Jack.withDraw(50);

        Jack.chekingBalance();

        Jack.withDraw(260);

        Jack.chekingBalance();

        Jack.withDraw(1000);

        Jack.chekingBalance();


        System.out.println("=============");

        System.out.println(Jack);



    }



}
