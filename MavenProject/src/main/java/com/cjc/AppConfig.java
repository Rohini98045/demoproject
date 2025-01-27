package com.cjc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

@Bean
public Student s() {
Student stu=new Student(123,"Rohini","Pune");
return stu;
}
}
