package training_mine.Encapsulation_Mine;

public class EmployeeInfo {

    /*
    Name
    SSN
    Age
    Salary
     */

    private  String name;
    private long SSN;
    private int Age;
    private double Salary;

    public void setSalary(double Salary){
        this.Salary=Salary;
    }
    public double getSalary(){
        return Salary;
    }

    public void setAge(int Age){
        this.Age=Age;
    }
    public double getAge(){
        return Age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSSN(long SSN){
        this.SSN=SSN;
    }
    public long getSSN(){
        return SSN;
    }





}
