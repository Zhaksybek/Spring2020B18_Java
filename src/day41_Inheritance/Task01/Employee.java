package day41_Inheritance.Task01;

public class Employee {
    /*
    Task:
	create a  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
	create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
     create subclass of employee name it business analyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     */

    public double salary;
    public String name;
    public long   id;
    public String jobTitle;
    public char   gender;

 /*   public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
*/


    public String toString() {
        return "Name: " + name + ", Salary: $" + salary + ", ID: " + id +
                ", Job Title: '" + jobTitle + ", Gender: " + gender;
    }
}
