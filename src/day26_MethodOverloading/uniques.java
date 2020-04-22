package day26_MethodOverloading;

public class uniques {
    public static void main(String[] args) {
        String str="ABBCDDDDD";
        String result= "";

        for (int i=0; i<str.length(); i++) {
            int num = frequencyChar(str, str.charAt(i));
                if (num == 1) {
                    result += str.charAt(i);
                }

        }
        System.out.println(result);

        String str2="Cybertek";
        String result2 = uniques(str2);
        System.out.println(result2);


    }//main

    public static String uniques(String str){
        String result= "";

        for (int i=0; i<str.length(); i++) {
            int num = frequencyChar(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }

        }
        return result;

    }




    public static int frequencyChar(String str,char ch){  // counts one chars frequency
        char[] arr = str.toCharArray();  // [A, A, A]

        int count=0;
        for ( char eachChar : arr){
            if (eachChar==ch){
                count++;
            }
        }
        return count;
    }

}// class
