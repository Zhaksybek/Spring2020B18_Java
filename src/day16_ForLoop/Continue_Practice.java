package day16_ForLoop;

public class Continue_Practice {
    public static void main(String[] args) {
        /*
        print alphabet Z~A
        skip:  Y, H,J, D
         */
        for(char ch ='Z'; ch >= 'A'; ch--){
            if (ch=='Y' || ch=='H'  || ch== 'J' || ch=='A'){
                continue;
            }

            System.out.print(ch+" ");
        }

        System.out.println();

        for (int i = 1; i<= 100; i++){
            if (i % 3 ==0 || i%5 ==0){
                continue;
            }

            System.out.print(i+ " ");
        }
/*
task:
    write a program that can remove duplicated characters from a string
 */


    }
}
