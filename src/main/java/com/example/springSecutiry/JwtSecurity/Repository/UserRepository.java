package com.example.springSecutiry.JwtSecurity.Repository;

import com.example.springSecutiry.JwtSecurity.Entity.Role;
import com.example.springSecutiry.JwtSecurity.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    User findByRole(Role role);

}
