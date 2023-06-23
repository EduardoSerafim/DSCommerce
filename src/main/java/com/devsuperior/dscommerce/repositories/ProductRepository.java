package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("""
            SELECT obj
            From Product obj
            WHERE UPPER(obj.name) LIKE UPPER(CONCAT('%', :name, '%'))
            """)
    Page<Product> searchByName(String name, Pageable pageable);

    //Também é possível dessa forma
    //Page<Product> findByNameContaining(String nome, Pageable pageable);

}
