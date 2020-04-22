package day15_ForLoop;

public class forLoop_Practice {
    public static void main(String[] args) {
        /*
        odd number between  1~100 in a sigle line seperated by a space

         */
        String resultOdd ="";
        String resultEven ="";
     for (int number = 1; number <=100; number +=2){
         //System.out.print(number+" ");

         resultOdd += number + " ";
     }
        System.out.println(resultOdd);

        for (int numberEven = 2; numberEven <=100; numberEven +=2){
           // System.out.println(numberEven);
            resultEven += numberEven+" ";
        }

    }
}
