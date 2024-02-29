package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

      Long loginId;
      String stockmail;
    
     String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Long getLoginId() {
        return loginId;
    }
    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }
    public String getStockmail() {
        return stockmail;
    }
    public void setStockmail(String stockmail) {
        this.stockmail = stockmail;
    }
   
    

     
    

    
}