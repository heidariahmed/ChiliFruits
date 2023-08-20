package com.example.forsakringGirot.service;

import com.example.forsakringGirot.dataAccess.ChiliFruit;

import java.util.List;

public interface ChiliFruitService {

    List<ChiliFruit> getAllChiliFruits();

    void updateQuantity(int chiliFruitId, int newQuantity);
}