package com.example.demo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    public List<String> hello(){
        return List.of("hello" ,"masud");
    }
    public List<Student> students(){
        return List.of(
                new Student(
                        8L,
                        "Masud",
                        "masud@gmail.com",
                        LocalDate.of(1999, Month.NOVEMBER,11),
                        23
                )
        );
    }
}
