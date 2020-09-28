package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Sick;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Sick entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SickRepository extends JpaRepository<Sick, Long> {
}
