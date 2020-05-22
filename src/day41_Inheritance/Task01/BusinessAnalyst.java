package day41_Inheritance.Task01;

public class BusinessAnalyst extends Employee {

    /*
    create subclass of employee name it business analyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     */

   // public BusinessAnalyst() {
   // }

    public BusinessAnalyst(String name, double salary, long id, String jobTitle, char gender ) {
        this.name=name;
        this.gender=gender;
        this.salary=salary;
        this.id=id;
        this.jobTitle=jobTitle;

    }

    public void writingRequiremnts(){
        System.out.println(name+" is writing Requirements");
    }
    public void gathering(){
        System.out.println(name+" is gathering information");
    }



}
