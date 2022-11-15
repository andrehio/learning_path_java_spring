package com.sistema_userdept.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_userdept.userdept.entities.User;

// Interface com todas as funcionalidades do JPA Reposutory
public interface UserRepository extends JpaRepository<User, Long>{

}
