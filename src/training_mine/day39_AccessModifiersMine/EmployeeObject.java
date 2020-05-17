package training_mine.day39_AccessModifiersMine;

import org.w3c.dom.ls.LSOutput;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 =new Employee("Zhaks");
        System.out.println(employee1);


        Employee employee2 =new Employee("Zhaks","FullTime");
        System.out.println(employee2);

        Employee employee3 =new Employee("Zhaks","FullTime", 123654);
        System.out.println(employee3);

        Employee employee4 =new Employee("Zhaks","FullTime", 123654,130_000);
        System.out.println(employee4);


        Employee employee5 =new Employee("Zhaks","FullTime", 123654,130_000,'M');
        System.out.println(employee5);







    }



}
