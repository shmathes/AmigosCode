package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//@Component
@Repository
//@Primary //Will be the default bean to inject
public class CustomerRepository implements CustomerRepo
{
    @Override
    public List<Customer> getCustomers() {
        //TODO connect to real DB
        return Collections.singletonList(
                new Customer(1L, "Implement DB", "todo")
        );
    }

    @Override
    public Customer getCustomer(Long id) {
        return null;
    }

    @Override
    public void postCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(Long id) {

    }
}
