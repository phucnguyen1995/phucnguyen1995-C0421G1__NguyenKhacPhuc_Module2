package com.example.model.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private int customerCode;
    private String customerName;
    private String customerPhone;
    private String customerEmail;

    @OneToMany(mappedBy = "customer")
    private Set<Deal> dealSet;

    public Customer() {
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Set<Deal> getDealSet() {
        return dealSet;
    }

    public void setDealSet(Set<Deal> dealSet) {
        this.dealSet = dealSet;
    }
}
