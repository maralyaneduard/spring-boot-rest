package com.em.auto.repository;

import com.em.auto.entity.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by eduardm on 11/16/16.
 */
@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {
}
