package com.example.forsakringGirot.repository;

import com.example.forsakringGirot.dataAccess.ChiliFruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface ChiliFruitRepository extends JpaRepository<ChiliFruit, Long> {
    List<ChiliFruit> findByOrigin(String origin);
}