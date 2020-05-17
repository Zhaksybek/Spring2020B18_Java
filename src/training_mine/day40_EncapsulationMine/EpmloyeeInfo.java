package training_mine.day40_EncapsulationMine;

public class EpmloyeeInfo {

    private double Salary;
    private long SSN;
    private int ID;
    private String Address;

    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary(){
        return Salary;
    }

    public void setSalary(double Salary){
        this.Salary=Salary;
    }

    public long getSSN(){
        return SSN;
    }

    public void setSSN(long SSN) {
         this.SSN=SSN;
    }






}
