package day14_StringClass;

public class StringManipulatuin {
    public static void main(String[] args) {

        String str = "I like to J  learn Java. I like to watch the movie Jumanji";

                    int a1 = str.indexOf("J");//  first J

        System.out.println(a1);

                    int a2 =    str.indexOf("Jum");
        System.out.println(a2);

                    int a3 = str.indexOf(" I") + 1 ;
        System.out.println(a3);

        System.out.println("-----------------------------");

        // lastIndexOf()

        String s = "I Like Java, and I Like reading";

             int b1 =  s.lastIndexOf("I");   // last "I"
        System.out.println(b1);


           int b2 = s.lastIndexOf("L");

        System.out.println(b2);

        String z = "I Like C#, C# is cool";

        int c2  = z.lastIndexOf("C");

        char ch1 = z.charAt(11);

        System.out.println("11 is: " + ch1);

        System.out.println(c2);



        String x = "I Like Java, Java is fun, Java programming is fun";

        int d1 = x.indexOf("Java is");
        System.out.println(d1);

        int d2 = x.indexOf(", J")+2;
        System.out.println(d2);


        int d3 = x.lastIndexOf("J");
        System.out.println("d3: " +d3);

        int d4  = x.indexOf("Java p");
        System.out.println(d4);








    }
}
