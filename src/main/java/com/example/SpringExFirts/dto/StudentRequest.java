package com.example.SpringExFirts.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Getter
@Setter
public class StudentRequest {
    @Min(18)
    @Max(26)
    private int age;
    private String sname;
}
