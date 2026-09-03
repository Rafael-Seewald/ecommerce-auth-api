package com.rafaelseewald.ecommerce_auth_api.domain.ports.out;

import com.rafaelseewald.ecommerce_auth_api.domain.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepositoryPort {

    User save(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findById(UUID id);

    boolean existsByEmail(String email);
}
