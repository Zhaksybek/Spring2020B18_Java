package day35_Static;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();

         student1.name="Zhaksybek";

        System.out.println(student1);

        Student student2 = new Student();

        Student.printSchoolName();

    }


}
