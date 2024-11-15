package com.shellcompany.GestionApp.repository;

import com.shellcompany.GestionApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Esta interfaz gestiona las operaciones CRUD para la entidad Product
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
