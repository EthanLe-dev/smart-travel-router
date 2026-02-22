package com.hackathon.smart_travel_router.repository;

import com.hackathon.smart_travel_router.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
