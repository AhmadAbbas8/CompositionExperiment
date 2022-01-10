/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositionproject;
import java.util.ArrayList;

public class Faculty {

private String name ;
private ArrayList<Student>students = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }
public void addStudent(Student student)
{

this.students.add(student);

}
    
    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }





    
}
