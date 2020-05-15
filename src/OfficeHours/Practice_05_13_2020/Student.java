package OfficeHours.Practice_05_13_2020;

public class Student {

    String name;
    long id;
    static String schoolName = "Cybertek";

    public String toString(){
        return "Name: " + name + ", ID: " + id +", School name: "+schoolName;
    }

    public static void printSchoolName(){
        System.out.println(schoolName+" School");
    }
}


class studentObjects{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Madina";
        student1.id=123;


        Student student2 = new Student();
        student2.name = "Hanna";
        student2.id = 123456;
        System.out.println(student1);
        System.out.println(student2);



    }

}

