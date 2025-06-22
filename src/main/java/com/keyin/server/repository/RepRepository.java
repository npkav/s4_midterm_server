package com.keyin.server.repository;

import com.keyin.server.entity.ServiceRep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepRepository extends JpaRepository<ServiceRep, Long> {
    
}