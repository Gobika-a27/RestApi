package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Stock;
import com.example.demo.repository.StockRepo;



@Service
public class StockService {
    @Autowired
    StockRepo stockRepo;
    Stock stockavail;
    @SuppressWarnings("null")
    public Stock addstock(Stock stock) 
    {
        return stockRepo.save(stock);//insert
    }
    public List<Stock> getstock()
    {
        return stockRepo.findAll();//returns all details
    }
    @SuppressWarnings("null")
    public java.util.Optional<Stock> getstockbyId(Long id)
    {
        return stockRepo.findById(id);
    }
    @SuppressWarnings("null")
    public Stock editstock(Long loginid,Stock stock)
    {
        stockavail = stockRepo.findById(loginid).orElse(null);
        if(stockavail !=null)
        {    
              stockavail.setStockmail(stock.getStockmail());
              stockavail.setPassword(stock.getPassword());
             return stockRepo.saveAndFlush(stockavail);
        }
        else
        return null;
    }

    @SuppressWarnings("null")
    public void delstock(Long loginid)
    {
         stockRepo.deleteById(loginid);
    }
    
}