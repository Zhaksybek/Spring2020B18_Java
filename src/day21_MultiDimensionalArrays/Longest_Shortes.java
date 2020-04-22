package day21_MultiDimensionalArrays;

public class Longest_Shortes {
    public static void main(String[] args) {
        String[] names = {"Rabia", "Omer", "Emrah", "Mohammed"};

        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();

        String logestword = "";
        String shortestWord = "" ;

        for(int i = 0; i < names.length ; i++  ){

            if(names[i].length() > maxLengthString ){
                maxLengthString = names[i].length();
                logestword = names[i];
            }

            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }


        System.out.println(logestword);
        System.out.println(shortestWord);



    }
}
