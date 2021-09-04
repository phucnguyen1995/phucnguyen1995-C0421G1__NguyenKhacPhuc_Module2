package com.example.model.entity;


import javax.persistence.*;

@Entity
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dealId;

    private String dealCode;


    @ManyToOne(targetEntity = Customer.class)
    @JoinColumn(name="customer",referencedColumnName = "customerId")
    Customer customer;


    private String dateTime;
    private  int serviceName;
    private double money;
    private  double area;

    public Deal() {
    }

    public Long getDealId() {
        return dealId;
    }

    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }

    public String getDealCode() {
        return dealCode;
    }

    public void setDealCode(String dealCode) {
        this.dealCode = dealCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getServiceName() {
        return serviceName;
    }

    public void setServiceName(int serviceName) {
        this.serviceName = serviceName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
