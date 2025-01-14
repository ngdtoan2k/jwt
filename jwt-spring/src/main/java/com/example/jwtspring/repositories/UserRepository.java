package com.example.jwtspring.repositories;

//import com.springjwt.entities.User;
import com.example.jwtspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findFirstByEmail(String email);
}
