package com.example.demo.customer;

import java.util.List;

public interface CustomerRepo
{
    List<Customer> getCustomers();

    Customer getCustomer(Long id);

    void postCustomer(Customer customer);

    void deleteCustomer(Long id);
}
