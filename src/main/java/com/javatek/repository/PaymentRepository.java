package com.javatek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatek.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
