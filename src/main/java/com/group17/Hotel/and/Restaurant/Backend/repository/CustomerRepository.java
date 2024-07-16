package com.group17.Hotel.and.Restaurant.Backend.repository;

import com.group17.Hotel.and.Restaurant.Backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
