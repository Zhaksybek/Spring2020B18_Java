package assigments.Methods;

public class As_164 {


    public static void main(String[] args) {


        System.out.println(simpleRoomBook(true,2,1,2018));
    }

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
   // 7/1/2018 - 7/8/2018 and not available


        if (isAvailable==false || year==2018){
            return false;
        }else if (month==7 && year==2018  && day>=1 && day<=8){
            return false;
        }else {
            return true;
        }


    }


}//class
