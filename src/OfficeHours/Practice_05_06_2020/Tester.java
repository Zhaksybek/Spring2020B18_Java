package OfficeHours.Practice_05_06_2020;
/*
Create a class called Offer that has:
	instance fields :
			location, company, salary , isFullTime
	instance methods :
		setOfferInfo: can set the location, company, salary , isFullTime of the offer
		toString -- return all info about offers

 */
public class Tester {

    String name;
    String jobTitle;
    double salary;
    long employeeId;


    public void setInfo(String name, String jobTitle,double salary,long employeeId ){

        this.name =name;
        this.jobTitle =jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;

    }

    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", Salary: $"+salary+
                ", EmployeeID: "+employeeId;
    }

    public void smokeTesting(){
       int name =100;
        System.out.println(this.name+ " is doing smoke test ");

    }

    public void creatingTicket(){
        System.out.println(this.name+" creating ticket on Jira");
    }





}
