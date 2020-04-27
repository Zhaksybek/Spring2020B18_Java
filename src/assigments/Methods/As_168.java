package assigments.Methods;

public class As_168 {


    public static void main(String[] args) {
        String main ="Certified Wooden Spoon";
        String coverME ="o";
        String result ="";

        if (main.contains("hi")){
            result =main.replace("hi","[hi]");
        }

        if (! main.contains(coverME)){
            result = "["+coverME+"]";
        }else {
            result =main.replace(coverME,"["+coverME+"]");
        }

        System.out.println(result);



        /*
        int count =0;
        while (main.contains(coverME)){

            count++;
            main = main.replaceFirst(coverME,"" );   // after counting first "Java"

        }

        for (int i=0; i<count; i++){
            main2 = main2.replace(coverME,"["+coverME+"]")
        }


        System.out.println(count);
        System.out.println(main);
*/

        /*
       do{
           result+=main.substring(0,coverME.indexOf(coverME))+"[" + coverME  +"]";
           main =


        } while (!main.contains(coverME));

       /*
         for (int i=0; i<word5.length(); i++){
            if (!result5.contains(word5.substring(i,i+1))){
                result5 += word5.substring(i,i+1);
            }
        }
        System.out.println(result5);

        */





       // System.out.println(coverString("java methods", "me") ) ; //java [me]thods
    }

  /*  public static String coverString(String main, String coverME) {
     if (! main.contains(coverME)){
         return "["+coverME+"]";
     }




    }*/




}


