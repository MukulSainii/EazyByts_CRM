package com.crm.service.Impl;

import com.crm.Entity.Customer;
import com.crm.Repository.CustomerRepository;
import com.crm.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomeById(Long id) {
        customerRepository.deleteById(id);
    }


    @Override
    public List<Customer> searchCustomers(String search) {
        // Search by first name, last name, or company name
        Set<Customer> searchResults = new HashSet<>();

        searchResults.addAll(customerRepository.findByFirstNameContaining(search));
        searchResults.addAll(customerRepository.findByLastNameContaining(search));
        searchResults.addAll(customerRepository.findByCompanyContaining(search));
        searchResults.addAll(customerRepository.findByEmailContaining(search));

        return new ArrayList<>(searchResults);
    }

    @Override
    public List<Customer> searchCustomersByFirstNameAndLastName(String firstName, String lastName) {
        return (List<Customer>) customerRepository.findByFirstNameAndLastNameContaining(firstName, lastName);
    }

}
