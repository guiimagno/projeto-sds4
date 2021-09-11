package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvenda.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
