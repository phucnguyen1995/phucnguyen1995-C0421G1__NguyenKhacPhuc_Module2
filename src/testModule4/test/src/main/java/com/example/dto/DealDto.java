package com.example.dto;


import com.example.model.entity.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DealDto implements Validator {


    private Long dealId;


    @NotBlank(message = "Please fill out the form")
    @Pattern(regexp = "^MGD-\\d{5}$", message = "Not valid (MGD-xxxxx)")
    private String dealCode;


    Customer customer;

    @NotBlank(message = "Please fill out the form")
    private String dateTime;

    private  int serviceName;

    @NotNull(message = "Please fill out the form")
    @Min(500000)
    private double money;

    @NotNull(message = "Please fill out the form")
    @Min(value = 20)
    private  double area;



    public DealDto() {
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        DealDto dealDto = (DealDto) target;
        Date dateNow = new java.sql.Date(System.currentTimeMillis());
        try {
            Date dateFormat = new SimpleDateFormat("yyyy-MM-dd").parse(dealDto.getDateTime());
            if (dateFormat.before(dateNow)) {
                errors.rejectValue("dateTime", "", "Date can't before now");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}