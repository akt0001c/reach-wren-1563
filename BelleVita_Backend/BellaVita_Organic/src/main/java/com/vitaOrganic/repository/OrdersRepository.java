package com.vitaOrganic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitaOrganic.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer>{

}
