package training_mine.Old_training;

public class greatest {
    public static void main(String[] args) {

        int a = 25;
        int b = 79;
        int c = 87;

        boolean aGr = a>b&&a>c;
        boolean bGr = b>a&&b>c;
        boolean cGr = c>a&&c>b;

        if (aGr){
            System.out.println("a is Greater number: ==>"+a);
        } else if (bGr){
            System.out.println("Greater number is: " + b);
            }
        else if (cGr){
            System.out.println("Greater number is: "+c);
        }



        //String Greatestnumber = "";
/*
        if (a>b){
            if (a>c){
                System.out.println("Greatest number is: " + a);
               // Greatestnumber ="a" ;
            }
        }else if (b>a){
            if (b>c){
                System.out.println("Greatest number is: " + b);
              // Greatestnumber="b";
            }
        }else if (c>a){
            if (c>b){ System.out.println("Greatest number is: " + c);

                //Greatestnumber="c";
            }
        }
*/






    }
}
