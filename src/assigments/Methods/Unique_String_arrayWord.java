package assigments.Methods;

public class Unique_String_arrayWord {

    public static void main(String[] args) {
        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};

        for (int j=0; j < words.length; j++) {

            int count =0;
            for (int i = 0; i <words.length; i++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count == 1) {

                System.out.println(  words[j]  );
            }

        }



        printUniqueNumbers(words);
    }

    public static void printUniqueNumbers(String[] words){
        //WRITE YOUR CODE HERE

        for (int j=0; j < words.length; j++) {

            int count =0;
            for (int i = 0; i <words.length; i++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count == 1) {

                System.out.println(  words[j]  );
            }

        }


    }

}
