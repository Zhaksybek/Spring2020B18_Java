package day26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {
        /*
        Warmup tasks:
	1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
         */

        String str="AAA";
        char ch ='A';

         char[] arr = str.toCharArray();  // [A, A, A]

        int count=0;
        for ( char eachChar : arr){
            if (eachChar==ch){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("=TEST========================================");
        String str2="ABABABA";
        char ch2='B';
         int num  =  frequency(str2,ch2);

    }

    public static int frequency(String str,char ch){  // counts one chars frequency
        char[] arr = str.toCharArray();  // [A, A, A]

        int count=0;
        for ( char eachChar : arr){
            if (eachChar==ch){
                count++;
            }
        }
        return count;
    }



}
