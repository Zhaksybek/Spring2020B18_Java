package day09_Nested_If_Ternary;

public class loan_nestedIF2 {
    public static void main(String[] args) {

        double salary = 20000;
        byte workHistory = 1;

        if(salary>=30000){
                       if(workHistory >= 2){
                           System.out.println("You are qualified for loan");
                       }
        } else {
            System.out.println("You must earn at least $30000");
        }






    }
}
