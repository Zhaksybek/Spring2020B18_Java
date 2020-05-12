package day37_constructors;

public class CybertekStudents {

    static String schoolName;
    String studentNAme;
    int groupName;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch ){
        schoolName       =  "Cybertek";
        this.studentNAme =  studentName;
        this.groupName   =  groupNumber;
        this.batch       =  batch;

    }

    public String toString(){
        return "Name: "+studentNAme+", Batch "+batch+", in group: "+groupName+", School name: "+schoolName;
    }


}


class CObjects{

    public static void main(String[] args) {
        CybertekStudents students1 = new CybertekStudents("Malica",2,"B18");
        CybertekStudents students2 = new CybertekStudents("Hanna",5,"B18");

        System.out.println(students2);



    }


}
