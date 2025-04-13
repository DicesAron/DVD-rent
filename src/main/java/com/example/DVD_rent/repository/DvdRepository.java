package com.example.DVD_rent.repository;

import com.example.DVD_rent.model.Dvd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvdRepository extends JpaRepository<Dvd, Long> {
}

