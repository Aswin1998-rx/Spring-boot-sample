package com.example.SpringExFirts.services;

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

    public Student saveStudent(Student student){
      return  srepo.save(student);
    }
    public List<Student> saveStudent(List<Student> students){

        return  srepo.saveAll(students);
    }
    public List<Student> getStudents(){
        return srepo.findAll();

    }

    public Optional<Student> findStudentById(int sid){
        return srepo.findById(sid);

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
