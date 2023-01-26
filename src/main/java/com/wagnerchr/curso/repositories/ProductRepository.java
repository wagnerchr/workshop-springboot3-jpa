
package com.wagnerchr.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagnerchr.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
