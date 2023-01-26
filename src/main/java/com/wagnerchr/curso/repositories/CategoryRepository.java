
package com.wagnerchr.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagnerchr.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
