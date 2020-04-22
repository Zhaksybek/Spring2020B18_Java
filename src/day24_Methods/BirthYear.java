package day24_Methods;

public class BirthYear {

    public static void Age(short birthYear){  //2020
        int currentYear = 2020;
        int age = currentYear - birthYear;
        if (age>0 && birthYear>1900) {
            System.out.println(age);
        }else{
            System.out.println("invalid");
        }

    }

    public static void main(String[] args) {



    }//main


    public static void printHello(){
        System.out.println("Hello");
    }

    public static void prontCybertek(){
        System.out.println("Cybertek");
    }


    public static void printCybertek(){

        printHello();
        printCybertek();

    }






}
