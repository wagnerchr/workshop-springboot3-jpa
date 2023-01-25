
package com.wagnerchr.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagnerchr.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
