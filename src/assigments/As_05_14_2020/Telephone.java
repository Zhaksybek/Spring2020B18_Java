package assigments.As_05_14_2020;

public class Telephone {
    /*
    Write the definition of a class Telephone.
The class has no constructors, one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.
     */

    String number =quantity+"-"+(int) (total/100) +"-"+(int)(total*100)%10000;
    public static int quantity = 250 ;
    public static double total = 15658.92;
    //t.setNumber("202-202-1211")



    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }



}
