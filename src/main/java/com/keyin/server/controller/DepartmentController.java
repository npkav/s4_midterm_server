package com.keyin.server.controller;

import com.keyin.server.entity.Department;
import com.keyin.server.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
@CrossOrigin(origins = "*")
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;
    
    @GetMapping
    public List<Department> getAllDepartments() {return departmentService.getAllDepartments();}
    
    @GetMapping("/{id}")
    public Department getDepartmentByID(@PathVariable Long id) {return departmentService.getDepartmentByID(id);}
    
    @PostMapping
    public Department createDepartment(@RequestBody Department department) {return departmentService.saveDepartment(department);}
    
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable Long id, @RequestBody Department department) {return departmentService.updateDepartment(id, department);}
    
    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {departmentService.deleteDepartment(id);}
} 