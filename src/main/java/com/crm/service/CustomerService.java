package com.crm.service;

import com.crm.Entity.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer saveCustomer(Customer customer);

    Customer getCustomerById(Long id);
    Customer updateCustomer(Customer customer);

    void deleteCustomeById(Long id);

    List<Customer> searchCustomers(String search);

    List<Customer> searchCustomersByFirstNameAndLastName(String firstName, String lastName);
//    List<Customer> searchCustomer(String search);
}
