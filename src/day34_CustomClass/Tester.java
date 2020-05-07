package day34_CustomClass;

public class Tester {

    String name;
    long employeeID;
    String jobTitle;
    double salary;

   //instance  variables

    public  void setTesterInfo(String name, long employeeID, String jobTitle, double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    public String toString(){

        return   "Name: "+name+ ", Job Title: "+jobTitle+
                ", employee Id: "+employeeID+", salary: "+salary;

    }




}
