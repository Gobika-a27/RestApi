package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name = "StockDetails")
@Transactional
public class StockDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long productId;
    String productName;
    String StocksIn;
    String StockSold;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    CustomerDetail customerDetail;

    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getStocksIn() {
        return StocksIn;
    }
    public void setStocksIn(String stocksIn) {
        StocksIn = stocksIn;
    }
    public String getStockSold() {
        return StockSold;
    }
    public void setStockSold(String stockSold) {
        StockSold = stockSold;
    }
    public CustomerDetail getCustomerDetail() {
        return customerDetail;
    }
    public void setCustomerDetail(CustomerDetail customerDetail) {
        this.customerDetail = customerDetail;
    }


}
