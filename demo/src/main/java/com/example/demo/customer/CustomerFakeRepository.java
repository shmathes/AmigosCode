package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Component(value = "fake")
@Repository
//@Qualifier(value = "fake")
public class CustomerFakeRepository implements CustomerRepo
{
    @Override
    public List<Customer> getCustomers()
    {
        return Arrays.asList(
                new Customer(1L, "James Bond", "password123"),
                new Customer(2L, "Shawn Mathes", "123password")
        );
    }
}
