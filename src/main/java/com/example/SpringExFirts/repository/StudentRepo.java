package com.example.SpringExFirts.repository;

import com.example.SpringExFirts.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    

}
