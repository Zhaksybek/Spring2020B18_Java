package assigments.As_05_24_2020;

public class EducationalInstitution {
/*
A constructor that accepts an int which is used to initialize the duration instance variable
 */

    private int years;
    public EducationalInstitution(int years){
        this.years=years;
    }



    public String graduationRequirements(){
        int d=years;
        return d+" years of study";
    }
    /*
    /home/runner/UnitTests.java:12: error: no suitable method found for graduationRequirements(no arguments)
    assertEquals("3 years of study and passing the bar", sc.graduationRequirements());
                                                           ^
    method EducationalInstitution.graduationRequirements(int) is not applicable
     */

   /* public EducationalInstitution(){

    }

    */




}

class LawSchool extends EducationalInstitution{

    /*
    a (default) constructor that invokes the superclass constructor
    with the value 3 (law school is typically a three year program).
     */
    public LawSchool(){
        super(3);
    }
    public String graduationRequirements(int d){
        return graduationRequirements()+" and passing the bar";
    }


}
