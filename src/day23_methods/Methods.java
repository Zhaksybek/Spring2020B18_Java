package day23_methods;

public class Methods {
   /*
    Access-modifer specifier return-type  methodName(){
					statements;
			}
			step1: Hello Cybertek
			step2: Hello World 5 times
			step3: Hello Btach 18
			step4: Hello World 5 times
			step5: Helle Saim
			step6: Hello World 5 times
     */

    public static void main(String[] args) {

        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();

        System.out.println("================");

        printEvenNum1To100();
        printOddNum1To100();


    }

    //    ----------------------------------------------------------

    public static void printOddNum1To100(){

        for (int i=1 ; i<=100; i++){
            if (i%2!=0){
                System.out.print(i+ " ");
            }
        }
        System.out.println(); //line breaker
    }
//    ----------------------------------------------------------
    public static void printEvenNum1To100(){
        for (int i=1 ; i<=100; i++){
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println(); //line breaker
    }

//    ----------------------------------------------------------

    public static void printHello5(){

        for(int i=0; i < 5; i++){
            System.out.println("Hello World");
        }
        System.out.println(); //line breaker
    }
//    ----------------------------------------------------------







}
