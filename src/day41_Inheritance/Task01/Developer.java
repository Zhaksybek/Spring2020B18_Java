package day41_Inheritance.Task01;

public class Developer extends Employee{
    /*
    create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
     */

    public Developer(String name, double salary, long id, String jobTitle, char gender ) {
        this.name=name;
        this.gender=gender;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;

    }

    public void fixingBug(){
        System.out.println(name+" is fixing the bug ");
    }

    public void coding(){
        System.out.println(name +" is coding");
    }


}
