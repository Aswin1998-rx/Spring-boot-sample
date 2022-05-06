package com.example.SpringExFirts.controller;

import com.example.SpringExFirts.dto.StudentRequest;
import com.example.SpringExFirts.entity.Student;
import com.example.SpringExFirts.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class DemoController {

    @Autowired
    private StudentService service;


    @PostMapping("/addStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody @Validated StudentRequest studentRequest){
        return  new ResponseEntity<>(service.saveStudent(studentRequest), HttpStatus.CREATED);

    }
    @GetMapping("/addStudents")
    public List<Student> addStudents(List<Student> students){
        return service.saveStudent(students);
    }


  @GetMapping("/students")
    public ResponseEntity <List<Student>>getAllStudents(){
        return ResponseEntity.ok(service.getAllStudents());
    }


    @GetMapping("/getStudentById/{sid}")

    public  Student findStudentById(@PathVariable int sid){

            return service.findStudentById(sid);


    }

    @PutMapping("/updateStudent")
    public Student updaStudent(@RequestBody StudentRequest student1){
        return service.saveStudent(student1);

    }
    @DeleteMapping("/deleteStudent/{sid}")
    public String deleteStudent(@PathVariable int sid){
        return service.deleteStudent(sid);
    }


}
