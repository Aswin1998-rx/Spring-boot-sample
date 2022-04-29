package com.example.SpringExFirts.controller;

import com.example.SpringExFirts.entity.Student;
import com.example.SpringExFirts.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class DemoController {

    @Autowired
    private StudentService service;


    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        if(student.getAge()<0 || student.getAge()==0){
            throw new AgeNotValidException(student.getAge());
        }
        return service.saveStudent(student);

    }
    @GetMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudent(students);
    }


  @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }


    @GetMapping("/getStudentById/{sid}")
    public Optional<Student> findStudentById(@PathVariable int sid){
        return service.findStudentById(sid);
    }

    @PutMapping("/updateStudent")
    public Student updaStudent(@RequestBody Student student){
        return service.saveStudent(student);

    }
    @DeleteMapping("/deleteStudent/{sid}")
    public String deleteStudent(@PathVariable int sid){
        return service.deleteStudent(sid);
    }


}
