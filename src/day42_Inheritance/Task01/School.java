package day42_Inheritance.Task01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called school:
					create 3 objects of student and set their info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
 */
public class School {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student  student3 = new Student();

        student1.setStudentInfo("Jack", 26, 'M', 12354,"Java");
        student2.setStudentInfo( "Aishan", 32,'F',2378,"art" );
        student3.setStudentInfo( "Messi", 10,'M',2309,"soccer");


        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(student1,student2,student3));

        for (Student each   : studentList){
           // System.out.println(each);
            System.out.println("Name: "+each.name+", ID: "+each.studentID);
        }


    }
}
