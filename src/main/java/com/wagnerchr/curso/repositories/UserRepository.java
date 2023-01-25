
package com.wagnerchr.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagnerchr.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
