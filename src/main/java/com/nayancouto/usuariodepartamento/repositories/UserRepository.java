package com.nayancouto.usuariodepartamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nayancouto.usuariodepartamento.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
