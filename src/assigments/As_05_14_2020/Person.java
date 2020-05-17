package assigments.As_05_14_2020;

public class Person {

    private String firstname;
    private String lastname;
    private int birthmonth;
    private  int birthday;
    private int birthyear;
    private String ssn;

    public Person(String firstname, String lastname, int birthday, int birthmonth, int birthyear, String ssn){
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthday=birthday;
        this.birthmonth=birthmonth;
        this.birthyear=birthyear;
        this.ssn=ssn;
    }

    public void setFirstname(String firstname){
        this.firstname=firstname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getBirthday(){
        return birthmonth+"/"+birthday+"/"+birthyear;
    }

    public boolean verifySSN(String ssn){
        if (this.ssn==ssn){
            return true;
        }else {
            return false;
        }
    }







}
