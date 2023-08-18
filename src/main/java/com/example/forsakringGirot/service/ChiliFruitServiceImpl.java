package com.example.forsakringGirot.service;

import com.example.forsakringGirot.dataAccess.ChiliFruit;
import com.example.forsakringGirot.repository.ChiliFruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiliFruitServiceImpl implements ChiliFruitService {


    private final ChiliFruitRepository chiliFruitRepository;

    @Autowired
    public ChiliFruitServiceImpl(ChiliFruitRepository chiliFruitRepository) {
        this.chiliFruitRepository = chiliFruitRepository;
    }

    @Override
    public List<ChiliFruit> getAllChiliFruits() {
        return chiliFruitRepository.findAll();
    }

    @Override
    public void updateQuantity(Long chiliFruitId, int newQuantity) {
        if (newQuantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }

        ChiliFruit chiliFruit = chiliFruitRepository.findById(chiliFruitId)
                .orElseThrow(() -> new IllegalArgumentException("Chili fruit not found"));

        chiliFruit.setQuantity(newQuantity);
        chiliFruitRepository.save(chiliFruit);
    }
}
