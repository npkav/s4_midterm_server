package com.keyin.server.service;

import com.keyin.server.entity.ServiceRep;
import com.keyin.server.repository.RepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepService {
    
    @Autowired
    private RepRepository RepRepository;
    
    public List<ServiceRep> getAllServiceReps() {return RepRepository.findAll();}
    
    public ServiceRep getServiceRepByID(Long ID) {return RepRepository.findById(ID).orElse(null);}

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