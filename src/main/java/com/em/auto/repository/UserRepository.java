package com.em.auto.repository;

import com.em.auto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eduardm on 11/16/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
