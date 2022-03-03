package tn.esprit.spring.entities.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Product;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {

}
