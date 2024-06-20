package less4.controller;

import less4.model.Student;
import less4.service.StudentGroupService;

public class StudentGroupController {

    private final StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }

}
