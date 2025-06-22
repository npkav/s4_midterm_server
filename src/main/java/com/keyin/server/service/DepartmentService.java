package com.keyin.server.service;

import com.keyin.server.entity.Department;
import com.keyin.server.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    
    @Autowired
    private DepartmentRepository departmentRepository;
    
    public List<Department> getAllDepartments() {return departmentRepository.findAll();}
    
    public Department getDepartmentByID(Long ID) {return departmentRepository.findById(ID).orElse(null);}
    
    public Department saveDepartment(Department department) {return departmentRepository.save(department);}
    
    public Department updateDepartment(Long ID, Department department) {
        department.setID(ID);
        return departmentRepository.save(department);
    }
    
    public void deleteDepartment(Long ID) {departmentRepository.deleteById(ID);}
} 