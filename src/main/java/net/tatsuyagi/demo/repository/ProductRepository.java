package net.tatsuyagi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tatsuyagi.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // methods to retrieve products by name, price, etc
}