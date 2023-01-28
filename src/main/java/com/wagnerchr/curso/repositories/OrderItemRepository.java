
package com.wagnerchr.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagnerchr.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
