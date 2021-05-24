package com.example.demo.customer;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequestMapping(path = "api/v2/customers")
@RestController
public class CustomerControllerV2
{
    private CustomerService customerService;

    public CustomerControllerV2(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers()
    {
//        return Collections.singletonList(
//                new Customer(0L, "V2", "v2")
//        );
        return customerService.getCustomers();
    }

    @GetMapping(path = "customer/{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id){
        return customerService.getCustomer(id);
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer)
    {
        System.out.println("POST REQUEST");
        System.out.println(customer);
        customerService.postCustomer(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST for customer with id " + id);
        customerService.deleteCustomer(id);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUT REQUEST");
        System.out.println(customer);
    }
}
