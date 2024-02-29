package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StockDetail;

@Repository
public interface DetailRepo extends JpaRepository<StockDetail,Long>{

    
} 
