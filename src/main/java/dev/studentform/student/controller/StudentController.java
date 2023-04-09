package dev.studentform.student.controller;


import dev.studentform.student.modal.Student;
import dev.studentform.student.service.SequenceGeneratorService;
import dev.studentform.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static dev.studentform.student.modal.Student.SEQUENCE_NAME;


@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;


    @Autowired
    private SequenceGeneratorService service;

    public StudentController() {
    }

    @PostMapping("/add")

    public ResponseEntity<?> saveStudent(@RequestBody Student student){

        if (student == null || student.getName() == null || student.getDob() == null ||  student.getClassSelected() == null || student.getDivisionSelected() == null || student.getGenderSelected() == null ) {
            return ResponseEntity.badRequest().body("Invalid student information provided");}

        student.setId(service.getSequenceNumber(SEQUENCE_NAME));
        studentService.saveStudent(student);
        return new ResponseEntity("Student added successfully", HttpStatus.OK);}
    @GetMapping("/getAll")
      public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}

