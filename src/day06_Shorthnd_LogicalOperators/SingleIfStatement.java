package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {

        boolean coldWather = true;
        if(coldWather) {
            // true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }

        boolean coronaDetected = true;
        if(coronaDetected){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding");
        }

        System.out.println("======================================================");

        int a = 69;
        boolean evenNumber = a % 2  == 0;  // if a number can be devided by 2 without reminder
        //boolean oddNumber = a % 2 != 0;   // if the number cannot be divided by 2 evenly
        /* if(evenNumber){
             System.out.println(a + " is even number" );
         }

         if(oddNumber) {
             System.out.println(a + " is odd number");
         }    */


        if(evenNumber){
            System.out.println(a + " is even number" );
        }

        if(!evenNumber) {
            System.out.println(a + " is odd number");
        }

    }
}
