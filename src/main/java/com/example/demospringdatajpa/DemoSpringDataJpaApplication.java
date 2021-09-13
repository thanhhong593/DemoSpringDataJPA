package com.example.demospringdatajpa;

import com.example.demospringdatajpa.entity.Employee;
import com.example.demospringdatajpa.responsitory.EmployeeReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class DemoSpringDataJpaApplication {
    @Autowired
    private EmployeeReponsitory employeeReponsitory;

//    private Employee employee = Employee.builder().firstName("Hoang").lastName("Hong")
//            .email("Hoang@gmail.com").build();

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringDataJpaApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(EmployeeReponsitory e) {
        return (args) -> {
//            add(employee);
//            Employee employee = new Employee("Hoang","Hong","Hoang@gmail.com");
//            delete((long) 1);
            System.out.println(e.findAll());

        };
    }


    private Employee add(Employee employee) {
        return employeeReponsitory.save(employee);
    }
    private void delete(Long id) {

        employeeReponsitory.deleteById(id);
        System.out.println(id);
    }
//    private void update(long e){
//
//
//
//    }
}
