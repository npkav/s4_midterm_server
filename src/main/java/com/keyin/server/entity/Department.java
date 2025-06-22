package com.keyin.server.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "department_name")
    private String departmentName;
    private String description;
    

    
    public Department() {}

    public Long getID() { return id; }
    public void setID(Long id) { this.id = id; }
    
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}