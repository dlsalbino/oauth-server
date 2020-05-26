package br.com.azusah.controller;

import br.com.azusah.model.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping(value = "/users")
public class EmployeeController {

    @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Collection<Employee> getAll() {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("Daniel Albino");
        return Collections.singletonList(employee);
    }
}
