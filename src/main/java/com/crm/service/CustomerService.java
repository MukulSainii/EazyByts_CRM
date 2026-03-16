package com.crm.service;

import com.crm.Entity.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface CustomerService {
    Page<Customer> getAllCustomers(Pageable page);

    Customer saveCustomer(Customer customer);

    Customer getCustomerById(Long id);
    Customer updateCustomer(Customer customer);

    void deleteCustomeById(Long id);

    List<Customer> searchCustomers(String search);

    List<Customer> searchCustomersByFirstNameAndLastName(String firstName, String lastName);
//    List<Customer> searchCustomer(String search);
}
