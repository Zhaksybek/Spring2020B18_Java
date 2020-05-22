package day41_Inheritance.Task01;

public class Tester extends Employee {
    /*
    create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing

	public double salary;
    public String name;
    public long   id;
    public String jobTitle;
    public char   gender;
     */
    public Tester(String name, double salary, long id, String jobTitle, char gender ) {
        this.name=name;
        this.gender=gender;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;

    }

    public void reportingBug(){
        System.out.println(name+"is Reporting bug");
    }

    public void testing(){
        System.out.println(name+" is testing");
    }
}
