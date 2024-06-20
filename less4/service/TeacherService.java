package less4.service;

import less4.model.Teacher;
import less4.view.TeacherView;

import java.util.List;

public class TeacherService {

    private final TeacherView view = new TeacherView();

    public void sendOnConsole(List<Teacher> teachers){
        view.sendOnConsole(teachers);
    }
    public Teacher createTeacher(int id, String name, String lastName){
        return  new Teacher(id, name, lastName);
    }

    public void renameTeacher (Teacher teacher,String name, String lastName){
        teacher.setLastName(lastName);
        teacher.setName(name);
    }
    public void renameTeacher (Teacher teacher, String lastName){
       teacher.setLastName(lastName);
    }

    public void setId(Teacher teacher, int id){
        teacher.setId(id);
    }
}
