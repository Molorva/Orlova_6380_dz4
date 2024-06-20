package less4.service;

import less4.model.Student;
import less4.model.Teacher;
import less4.view.StudentView;

import java.util.List;

public class StudentService {

    StudentView view = new StudentView();

    public void sendOnConsole(List<Student> students){
        view.sendOnConsole(students);
    }
    public Student createStudent(int id, String name, String last) {
        return new Student(id, name, last);
    }

    public void renameStudent(Student student, String lastName){
        student.setLastName(lastName);
    }
    public void renameStudent(Student student,String name, String lastName){
        student.setLastName(lastName);
        student.setName(name);
    }

}
