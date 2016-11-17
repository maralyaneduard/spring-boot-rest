package com.em.auto.repository;

import com.em.auto.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eduardm on 11/16/16.
 */
public interface ModelRepository extends JpaRepository<Model, Long> {
}
