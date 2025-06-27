package com.keyin.server.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
    
    
    
    public ServiceRep() {}
    
    @JsonProperty("id")
    public Long getID() { return id; }
    public void setID(Long id) { this.id = id; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
    
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    @JsonProperty("departmentID")
    public void setDepartmentFromId(Long departmentId) {
        this.department = new Department();
        this.department.setID(departmentId);
    }

    public Long getDepartmentID() {
        return department != null ? department.getID() : null;
    }

    @JsonProperty("roleID")
    public void setRoleFromId(Long roleId) {
        this.role = new Role();
        this.role.setID(roleId);
    }

    public Long getRoleID() {
        return role != null ? role.getID() : null;
    }
} 