package training_mine.WhileDoWhile;

public class PracticeWhile_1_COUNT {
    public static void main(String[] args) {
        String sentences = "I like books, I have books, I need book, I buy books";
        // index                   z
        int count=0;
        for (int z=0; z<sentences.length() - 3; z++ ){
            if (sentences.substring(z,z+4).equals("book")){
                count++;

            }
        }
        System.out.println(count);

        System.out.println();

        String words = "Cybertek is school, Cybertek is good, I love Cybertek";
        //              i    i+MaxIndexOf(Cybertek+1(k))

        int nTimes =0;

        for (int i=0; i < words.length()-7; i++){
        //   stsrts:0       MaxIndex        iterator
            if (words.substring(i,i+8).equals("Cybertek")){
                nTimes++;    //53,  61
            }
        }
        System.out.println(nTimes);
       // System.out.println(words.length()-1);


        System.out.println("==========================================================");

        String str1 = "I love java, i love America, she loves shrimp, the're loves our tradition.";
        //               a  a+4
        int count1 =0;

        for (int a=0; a<str1.length()-4; a++){

            if (str1.substring(a,a+4).equals("love")){
                count1++;
            }


        }
        System.out.println(count1);



        }

    }

