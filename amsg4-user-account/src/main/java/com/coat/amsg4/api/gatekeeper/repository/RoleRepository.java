package com.coat.amsg4.api.gatekeeper.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coat.amsg4.api.gatekeeper.models.ERole;
import com.coat.amsg4.api.gatekeeper.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
