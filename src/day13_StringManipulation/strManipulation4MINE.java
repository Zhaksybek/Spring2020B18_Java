package day13_StringManipulation;

public class strManipulation4MINE {
    public static void main(String[] args) {

        String str2 = "Cybertek school is awesome";

        int first = str2.indexOf("s");   //s==>9
        int second  = str2.indexOf("is")+1;
        //char ch1 = str2.charAt(17);
        //System.out.println(ch1);
        System.out.println(first);
        System.out.println(second);

        System.out.println("--------------------------------------");

        String str = "I will create big company in the USA";
        int fir = str.indexOf("company");
        int sec = str.indexOf("USA")+1;
        System.out.println(fir);
        System.out.println(sec);


        System.out.println("--------------------------------------");

         String strNew = str.substring(18);
        System.out.println(strNew);

        String str3 = "Do you like ice creame or somthing hot";
         int numCR = str3.indexOf("creame");//16
          String   str4 = str3.substring(16);
          String    str5 = str3.substring(0,14+1);

        System.out.println(str5);
        System.out.println(str4);

        System.out.println("---------------------------------------");

        String fullFilmName = "Nurlan Koianbaev is produser, film My love is Aisulu";
        int beforFilm = fullFilmName.indexOf("film");
        char ch1 = fullFilmName.charAt(30);

        String newTwoLine = fullFilmName.substring(0,29)  + "\n"+ fullFilmName.substring(30);

        System.out.println(newTwoLine);
        //System.out.println(ch1); 30 ==>f
        //System.out.println(beforFilm);










    }
}
