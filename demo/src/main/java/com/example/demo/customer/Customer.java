package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer
{
    private final Long id;
    private final String name;
    private final String password;

    Customer(Long id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @JsonProperty("customerId") //Change the property name from id to customerId
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore //Prevents property from being sent back during the request
    public String getPassword(){return password;}

    //customerId
//    public Long getCustomerId(){ return id;}


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
