package com.keyin.server.repository;

import com.keyin.server.entity.ServiceRep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RepRepository extends JpaRepository<ServiceRep, Long> {
    List<ServiceRep> findByDepartmentID(Long departmentId);
    List<ServiceRep> findByRoleID(Long roleId);
    List<ServiceRep> findByDepartmentIDAndRoleID(Long departmentId, Long roleId);
    List<ServiceRep> findByFirstNameOrLastName(String firstName, String lastName);
}