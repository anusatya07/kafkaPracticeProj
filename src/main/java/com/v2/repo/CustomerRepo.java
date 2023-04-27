package com.v2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v2.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
