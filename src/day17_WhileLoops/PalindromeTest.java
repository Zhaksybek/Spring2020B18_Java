package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {

        String str = "Anna";
        String reversStr = ""; // store the reversed version of str

        int index = str.length()-1;

        while (index >= 0){
            reversStr += str.charAt(index);
            index--;
        }
        System.out.println(reversStr);

        boolean palindrome = reversStr.equals(str);

        if (palindrome==true){
            System.out.println("This word is palindrome: "+str);
        }else {
            System.out.println("This word isn't palindrome: "+str);
        }


    }
}
