package com.keyin.server.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "service_reps")
public class ServiceRep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    private String email;
    
    @Column(name = "department_id")
    private Long departmentID;
    
    @Column(name = "role_id")
    private Long roleID;
    
    
    
    public ServiceRep() {}
    
    public Long getID() { return id; }
    public void setID(Long id) { this.id = id; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public Long getDepartmentID() { return departmentID; }
    public void setDepartmentID(Long departmentID) { this.departmentID = departmentID; }
    
    public Long getRoleID() { return roleID; }
    public void setRoleID(Long roleID) { this.roleID = roleID; }
} 