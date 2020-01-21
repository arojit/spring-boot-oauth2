package com.example.techmantra.repository;

import com.example.techmantra.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
