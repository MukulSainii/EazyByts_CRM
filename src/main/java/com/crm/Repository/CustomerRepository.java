package com.crm.Repository;


import com.crm.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


    Collection<? extends Customer> findByFirstNameContaining(String search);

    Collection<? extends Customer> findByLastNameContaining(String search);
    Collection<? extends Customer> findByCompanyContaining(String search);

    Collection<? extends Customer> findByFirstNameAndLastNameContaining(String firstName, String lastName);

    Collection<? extends Customer> findByEmailContaining(String search);

}