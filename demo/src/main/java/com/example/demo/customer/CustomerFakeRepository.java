package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Component(value = "fake")
@Repository
//@Qualifier(value = "fake")
public class CustomerFakeRepository implements CustomerRepo
{
    private static Long id = 2L;
    private ArrayList<Customer> customers = new ArrayList<>(
            Arrays.asList(
                    new Customer(1L, "James", "pass123", "email@email.com"),
                    new Customer(2L, "Shawn", "123pass", "email@email.com")
            )
    );

    @Override
    public List<Customer> getCustomers()
    {
        return customers;
    }

    @Override
    public Customer getCustomer(Long id)
    {
        Customer customer = customers.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
        return customer;
    }

    @Override
    public void postCustomer(Customer customer)
    {
        id += 1;
        Customer c = new Customer(id, customer.getName(), customer.getPassword(), customer.getEmail());
        customers.add(c);
    }

    @Override
    public void deleteCustomer(Long id)
    {
        Customer c = getCustomer(id);
        customers.remove(c);
    }
}
