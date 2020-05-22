package assigments.As_05_17_2020;

public class UAGStudent {
    /*
    1.  Variables
name (String)
grade (int)
principalName (String, static, default value: "Ms. McKoy")
studentID (String)
nextID (int, static, default value: 100)
*/

    String name;
    int grade;
    static String principalName="Ms. McKoy";
    String studentID;
    static int nextID =100;

   public UAGStudent(String name, int grade){
       this.name=name;
       this.grade=grade;
       this.studentID=name.substring(0,1).toUpperCase()+nextID;
       nextID++;
   }

   public static void newPrincipal(String newPrincipal){
     principalName=  newPrincipal ;
   }

   public static void resetID(){
       nextID=100;
   }
   public String toString(){
       return name+" "+studentID;
   }



}
