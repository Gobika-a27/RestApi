package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Stock;
import com.example.demo.service.StockService;




@RestController
public class StockController {
    @Autowired StockService stockService;
    
    @PostMapping ("/poststock")
    public Stock addstock(@RequestBody Stock stock)
    {
        return stockService.addstock(stock);
    }
    @GetMapping ("/getstock")
    public List<Stock> getstock()
    {
        return stockService.getstock();
    }
    @GetMapping("/api/stock/{stockId}")
    public Optional<Stock> getstockbyId(@PathVariable Long stockId)
    {
        return stockService.getstockbyId(stockId);
    }
    @PutMapping("/editstock/{loginid}")
    public Stock editstock(@PathVariable Long loginid, @RequestBody Stock stock) {
        
        
        return stockService.editstock(loginid,stock);
    }

    @DeleteMapping("/delstock/{loginid}")
    public void delstock(@PathVariable Long loginid)
    {
         stockService.delstock(loginid);
    } 
    
}