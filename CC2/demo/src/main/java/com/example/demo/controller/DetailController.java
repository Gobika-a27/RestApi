package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StockDetail;
import com.example.demo.service.DetailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class DetailController {
    @Autowired
    DetailService detailService;
    @PostMapping("/postdetails")
    public StockDetail addStocks(@RequestBody StockDetail details) {
        return detailService.addDetail(details);
    }
    @GetMapping("/getdetails")
    public List<StockDetail> getStocks() {
        return detailService.getDetail();
    }
    @GetMapping("/stock/SortBy/{productName}")
    public List<StockDetail> getProductWithSorting(@PathVariable String productName)
    {
        return detailService.getProductWithSorting(productName);
    }
    
    
}
