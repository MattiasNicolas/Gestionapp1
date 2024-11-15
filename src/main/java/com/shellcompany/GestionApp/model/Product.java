package com.shellcompany.GestionApp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity // Define que esta clase será mapeada a una tabla en la base de datos
@Data // Las anotaciones @Data, @NoArgsConstructor, @AllArgsConstructor, y @Builder eliminan la necesidad de escribir manualmente getters, setters y constructores
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
// Indica que id es la clave primaria y se generará automáticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
// Indica que el campo name y price no pueden ser nulos
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    private String description;
}

