package day16_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i=1; i <=5; i++){
            System.out.println("Hello World");

            if (i==3) {
                break;
            }

        }


        for (char i ='a'; i <='z'; i++){
            System.out.println(i);

            if (i=='d'){
                break;
            }
        }





    }
}
