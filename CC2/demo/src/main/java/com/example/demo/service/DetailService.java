package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.StockDetail;
import com.example.demo.repository.DetailRepo;

@Service
public class DetailService {
    
    @Autowired
    DetailRepo detailRepo;
    public StockDetail addDetail(StockDetail details)
    {
        return detailRepo.save(details);
    }
    public List<StockDetail> getDetail()
    {
        return detailRepo.findAll();
    }
    public List<StockDetail> getProductWithSorting(String field)
    {
        Sort sort=Sort.by(Sort.Direction.ASC,field);
        return detailRepo.findAll(sort);
    }
    
}
