package com.keyin.server.service;

import com.keyin.server.entity.ServiceRep;
import com.keyin.server.entity.Issue;
import com.keyin.server.repository.RepRepository;
import com.keyin.server.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepService {

    @Autowired
    private IssueRepository issueRepository;
    
    @Autowired
    private RepRepository RepRepository;
    
    public List<ServiceRep> getAllServiceReps() {return RepRepository.findAll();}
    
    public ServiceRep getServiceRepByID(Long ID) {return RepRepository.findById(ID).orElse(null);}

    public List<Issue> getIssuesByRepId(Long repId) {
        return issueRepository.findByAssignedRepId(repId);
    }

    public List<ServiceRep> filterReps(Long departmentId, Long roleId) {
        if (departmentId != null && roleId != null) {
            return RepRepository.findByDepartmentIDAndRoleID(departmentId, roleId);
        } else if (departmentId != null) {
            return RepRepository.findByDepartmentID(departmentId);
        } else if (roleId != null) {
            return RepRepository.findByRoleID(roleId);
        } else {
            return RepRepository.findAll();
        }
    }

    public List<ServiceRep> searchRepsByName(String name) {
        return RepRepository.findByFirstNameOrLastName(name, name);
    }

    public List<ServiceRep> getRepsByRole(Long roleId) {
        return RepRepository.findByRoleID(roleId);
    }
    
    public ServiceRep saveServiceRep(ServiceRep serviceRep) {return RepRepository.save(serviceRep);}
    
    public ServiceRep updateServiceRep(Long ID, ServiceRep serviceRep) {
        serviceRep.setID(ID);
        return RepRepository.save(serviceRep);
    }
    
    public void deleteServiceRep(Long ID) {RepRepository.deleteById(ID);}
} 