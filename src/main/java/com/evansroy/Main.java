package com.evansroy;

import com.evansroy.model.Employee;
import com.evansroy.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setFirstName("Evans");
        employee.setLastName("Roy");
        employee.setEmailId("sirroy02@gmail.com");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Steph");
        employee1.setLastName("Oloo");
        employee1.setEmailId("stepholoo@gmail.com");
        employeeRepository.save(employee1);
    }
}
