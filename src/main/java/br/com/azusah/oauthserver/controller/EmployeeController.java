package br.com.azusah.oauthserver.controller;

import br.com.azusah.oauthserver.model.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping(value = "/users")
public class EmployeeController {

    @GetMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    Collection<Employee> getAll() {
        return Collections.singletonList(Employee.builder().id("1").name("Daniel Albino").build());
    }

}
