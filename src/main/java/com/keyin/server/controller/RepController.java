package com.keyin.server.controller;

import com.keyin.server.entity.ServiceRep;
import com.keyin.server.service.RepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicereps")
@CrossOrigin(origins = "*")
public class RepController {
    
    @Autowired
    private RepService repService;
    
    @GetMapping
    public List<ServiceRep> getAllServiceReps() {return repService.getAllServiceReps();}
    
    @GetMapping("/{id}")
    public ServiceRep getServiceRepByID(@PathVariable Long id) {return repService.getServiceRepByID(id);}
    
    @PostMapping
    public ServiceRep createServiceRep(@RequestBody ServiceRep serviceRep) {return repService.saveServiceRep(serviceRep);}
    
    @PutMapping("/{id}")
    public ServiceRep updateServiceRep(@PathVariable Long id, @RequestBody ServiceRep serviceRep) {return repService.updateServiceRep(id, serviceRep);}
    
    @DeleteMapping("/{id}")
    public void deleteServiceRep(@PathVariable Long id) {repService.deleteServiceRep(id);}
} 