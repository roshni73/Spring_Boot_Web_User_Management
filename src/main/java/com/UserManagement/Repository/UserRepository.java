package com.UserManagement.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.UserManagement.Entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}