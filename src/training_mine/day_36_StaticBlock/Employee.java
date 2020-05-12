package training_mine.day_36_StaticBlock;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    String name;
    long id;
    int  ssn;
    String jobTitle;
    double salary;
    String gender;



    public void setEmployeeInfo(String name, long id, int  ssn, String jobTitle, double salary, String gender){
        this.name =name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }

    public String toString(){
        return "Name: "+name+", ID: "+id+", SSN: "+ssn+", Job Title: "+jobTitle+", Salary: $"+salary
                +", Gender: "+gender;
    }

} // ==> Employee

class HumanResources{
    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();

    static {
        employee1.setEmployeeInfo("Oljas",19935,445666,"QA",140_000,"M");
        employee2.setEmployeeInfo("Marat",19934,445666,"Developer",140_000,"M");
        employee3.setEmployeeInfo("Aliya",19933,3445666,"SDET",140_000,"F");
        employee4.setEmployeeInfo("Margo",19932,445666,"HR",140_000,"M");
        employee5.setEmployeeInfo("Saia",19931,445666,"SDET",140_000,"F");

    }





} // HR CLASS

class BankOfKazakhstan{
    public static void main(String[] args) {

        ArrayList<Employee> list =new ArrayList<>();
        list.addAll(Arrays.asList(HumanResources.employee1,HumanResources.employee2));

        for (Employee each  : list ){
            System.out.println(each);
        }



    }
} // BofKZ

