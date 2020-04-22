package training_mine.Old_training;

public class if_else2 {
    public static void main(String[] args) {

        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

        float num1=12, num2=55.6f, num3=-4.2f,  smallernumber;

        if (num1<num2){
            if (num1<num3){
                smallernumber =num1;
            }
        }else {if (num2<num1){
                       if(num2<num3){
                          smallernumber = num2;
        }
        }else{smallernumber=num3;}}

       /* if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }

        System.out.println("Largest number is " + largestNumber);*/


    }
}
