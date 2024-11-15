package com.shellcompany.GestionApp.service;

import com.shellcompany.GestionApp.model.Product;
import java.util.List;
import java.util.Optional;

//Declaramos (no implementamos) los métodos que gestionarán las operaciones de negocio para los productos
public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
