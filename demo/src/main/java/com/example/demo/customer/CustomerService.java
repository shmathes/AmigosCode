package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService
{
    private CustomerRepo customerRepo;

    //@Qualifier("fake") => Will tell Spring to inject the CustomerRepo implementation with a value of fake
    @Autowired
    CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers()
    {
        return customerRepo.getCustomers();
    }

    Customer getCustomer(Long id){
        return customerRepo.getCustomer(id);
    }

    void postCustomer(Customer customer){
        this.customerRepo.postCustomer(customer);
    }

    void deleteCustomer(Long id){
        customerRepo.deleteCustomer(id);
    }
}
