package com.keyin.server.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "role_name")
    private String roleName;
    
    private String description;
    
    @Column(name = "department_id")
    private Long departmentID;
    

    
    public Role() {}
    
    public Long getID() { return id; }
    public void setID(Long id) { this.id = id; }
    
    public String getRoleName() { return roleName; }
    public void setRoleName(String roleName) { this.roleName = roleName; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public Long getDepartmentID() { return departmentID; }
    public void setDepartmentID(Long departmentID) { this.departmentID = departmentID; }
} 