package com.cookbook.controller;
/*
import com.cookbook.model.Employee;
import com.cookbook.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public EmployeeController() {
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("Employeers",employeeService.findAll());
        return "ListEmployeesPage";
    }


    @GetMapping("/cookbook/{id}")
    public String getEmployeeById(@PathVariable("id") String id, Model model){
        model.addAttribute("Empl",employeeService.getById(Integer.valueOf(id)));
        return "EmployeeByIdPage";

    }

    @GetMapping("/addEmployee")
    public String addUser(){
        return "AddNewEmployeePage";
    }

    @PostMapping("/addEmployee")
    public String addUser(@ModelAttribute("Employee")Employee cookbook){

        employeeService.save(cookbook);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editById(Model model, @PathVariable String id){
        model.addAttribute("emplEdit",employeeService.getById(Integer.valueOf(id)));
        return "EditEmployeePage";
    }

    @PostMapping("/edit/{id}")
    public String editById(@ModelAttribute("emplEdit")Employee cookbook) {
        employeeService.update(cookbook);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable String id){
        employeeService.deleteById(Integer.valueOf(id));
        return "redirect:/";
    }
}
*/
