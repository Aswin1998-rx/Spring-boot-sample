package com.example.SpringExFirts.services;

import com.example.SpringExFirts.controller.InvalidStudentException;
import com.example.SpringExFirts.dto.StudentRequest;
import com.example.SpringExFirts.entity.Student;
import com.example.SpringExFirts.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo srepo;


    public Student saveStudent(StudentRequest student1)
    {
      Student student =Student.build(0,student1.getSname(),student1.getAge());
      return  srepo.save(student);

    }
    public List<Student> saveStudent(List<Student> students){

        return  srepo.saveAll(students);
    }
    public List<Student> getAllStudents(){
        return srepo.findAll();

    }

    public Student findStudentById(int sid) throws InvalidStudentException {
        Student student = srepo.findById(sid).orElse(null);
       if(student !=null){
           return student;
       }
       else {
           throw new InvalidStudentException("Student not found"+ sid);
       }





    }
    public String deleteStudent(int sid){

        srepo.deleteById(sid);
        return "removed "+sid;
    }
    public Student updateStudent(Student student){
        Student existingStudent=srepo.findById(student.getSid()).orElse(null);
        existingStudent.setSname(student.getSname());
        existingStudent.setAge(student.getAge());
        return srepo.save(existingStudent);
    }
}
