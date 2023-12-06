package com.web.app.springbootwebapp.Controller;

import com.web.app.springbootwebapp.Entity.Employee;
import com.web.app.springbootwebapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping({"/", "/showEmployees"})
    public ModelAndView showEmployees(){
        ModelAndView modelAndView = new ModelAndView("list-employees");
        List<Employee> empList = employeeRepository.findAll();
        modelAndView.addObject("employees", empList);
        return modelAndView;
    }
}
