package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/hello")
    public List<String> hello(){
        return List.of("hello" ,"masud");
    }

    @GetMapping("/hello/student")
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
