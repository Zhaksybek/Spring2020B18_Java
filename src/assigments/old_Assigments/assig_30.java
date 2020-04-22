package assigments.old_Assigments;
import java.util.Scanner;

/*
-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Declare int variables count1, count2, count3

-Create a Scanner object named scan.

Execution flow using with example:

Use scanner to read all 3 values.

-Display prompt "Enter Item1, count and its price:"
Tomatoes
2
5.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)

 */
public class assig_30 {
    public static void main(String[] args) {

        //int count1 =0, count2=0, count3=0;
        double totalPrice = 0;
        String report = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        String Item1 = scan.next();
        //int count1 = scan.nextInt();
        double price1 = scan.nextDouble();



        System.out.println("Enter Item2 and its price:");
        String Item2 = scan.next();
        //int count2 = scan.nextInt();
        double price2 = scan.nextDouble();



        System.out.println("Enter Item3 and its price:");
        String Item3 = scan.next();
        //int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        totalPrice = price1+price2+price3;
        report= report = "Item1: "+Item1+" Price: "+price1+", Item2: "+Item2+" Price: "+
                price2+", Item3: "+Item3+" Price: "+price3;

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);


/*
       if (count1>0 && count2>0 && count3>0 ){
           totalPrice = (price1*count1)+(price2*count2)+(price3*count3);
           report = "Item1: "+Item1+" Price: "+(price1*count1)+", Item2: "+Item2+" Price: "+
                   (price2*count2)+", Item3: "+Item3+" Price: "+(price3*count3);

       }else  if (count1==0 && count2>0 && count3>0){
           totalPrice = (price2*count2)+(price3*count3);
           report = "Item2: "+Item2+" Price: "+(price2*count2)+", Item3: "+Item3+" Price: "+(price3*count3);

       }else if(count1>0&& count2==0 && count3>0){
           totalPrice = (price1*count1)+(price3*count3);
           report = "Item1: "+Item1+" Price: "+(price1*count1)+", Item3: "+Item3+" Price: "+(price3*count3);

       }else if (count1>0 && count2>0 && count3==0){
           totalPrice = (price1*count1)+(price2*count2);
           report = "Item1: "+Item1+" Price: "+(price1*count1)+", Item2: "+Item2+" Price: "+(price2*count2);

       }

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);

 */



       /*

       Tomatoes
2
5.4
Cheese
0
3.5
Apples
5
6.3

            Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5
            Total price: 42.3
        //System.out.println("Item1 is "+ "\""+Item1+"\""+","+"count is "+count1+", price is "+price1);
        // System.out.println("Item2 is "+ "\""+Item2+"\""+","+"count is "+count2+", price is "+price2);
// System.out.println("Item3 is "+ "\""+Item3+"\""+","+"count is "+count3+", price is "+price3);


      "Item1: Tomatoes Price: 10.8, //Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"
        */









    }
}
