package com.app.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.capstone.entity.ERole;
import com.app.capstone.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
