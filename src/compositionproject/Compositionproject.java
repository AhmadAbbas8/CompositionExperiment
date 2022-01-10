package compositionproject;

import java.util.ArrayList;

public class Compositionproject {

  
    public static void main(String[] args) {

Student student1 = new Student("Ahmad");
Student student2 = new Student("Ali");
Student student3 = new Student("pablo");


Faculty faculty = new Faculty("Engineering");

faculty.addStudent(student1);
faculty.addStudent(student2);
faculty.addStudent(student3);

ArrayList<Student> students = faculty.getStudents();

for(Student student : students)
System.out.println(student.getName());



    }
    
}
