package less4.controller;

import less4.model.Student;
import less4.model.Teacher;
import less4.model.User;
import less4.service.StudentService;
import less4.view.StudentView;
import less4.view.UserView;

import java.util.List;

public class StudentController implements UserController {


    private final StudentService service = new StudentService();

    public  void sendOnConsole(List<Student> students){
        service.sendOnConsole(students);
    }
    @Override
    public <T extends User> User create(T user) {
        return user;
    }

}
