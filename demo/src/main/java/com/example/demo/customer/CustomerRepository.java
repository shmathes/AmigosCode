package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

//@Component
@Repository
@Primary //Will be the default bean to inject
public class CustomerRepository implements CustomerRepo
{
    @Override
    public List<Customer> getCustomers() {
        //TODO connect to real DB
        return Collections.EMPTY_LIST;
    }
}
