package less4.controller;

import less4.model.Teacher;
import less4.model.User;
import less4.service.TeacherService;

import java.util.List;

public class TeacherController implements UserController{

    private final TeacherService service = new TeacherService();

    public  void sendOnConsole(List<Teacher> teachers){
        service.sendOnConsole(teachers);
    }
    @Override
    public <T extends User> User create(T user) {
        return user;
    }
}
