package assigments.Methods;

public class As_169 {
    public static void main(String[] args) {




    }






    public static String uniqueChars(String str) {
        //TODO: write your below
        String result = "";
     for (int i=0; i<str.length();i++){
         if (! result.contains(""+str.charAt(i))){
             result += str.charAt(i);
         }
     }
     return result;

    }





    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
     if (notEmpty==false){
         return false;
     }else if (taskId != (currentId+1)){
         return false;
     }else {
         return true;
     }

    }





}
