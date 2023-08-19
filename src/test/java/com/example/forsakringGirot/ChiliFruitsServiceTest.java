package com.example.forsakringGirot;

import com.example.forsakringGirot.dataAccess.ChiliFruit;
import com.example.forsakringGirot.repository.ChiliFruitRepository;
import com.example.forsakringGirot.service.ChiliFruitService;
import com.example.forsakringGirot.service.ChiliFruitServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class ChiliFruitsServiceTest {

    private ChiliFruitService chiliFruitService;

    @Mock
    private ChiliFruitRepository chiliFruitRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        chiliFruitService = new ChiliFruitServiceImpl(chiliFruitRepository);
    }

    @Test
    void testGetAllChiliFruits() {
        List<ChiliFruit> chiliFruits = new ArrayList<>();
        // Populate chiliFruits list

        when(chiliFruitRepository.findAll()).thenReturn(chiliFruits);

        List<ChiliFruit> result = chiliFruitService.getAllChiliFruits();
    }

    @Test
    void testUpdateQuantity() {
        Long chiliFruitId = 1L;
        int newQuantity = 50;

        ChiliFruit chiliFruit = new ChiliFruit();
        // Populate chiliFruit entity

        when(chiliFruitRepository.findById(chiliFruitId)).thenReturn(Optional.of(chiliFruit));

        chiliFruitService.updateQuantity(chiliFruitId, newQuantity);

        // Verify that the quantity was updated correctly
        verify(chiliFruitRepository, times(1)).save(chiliFruit);
    }
}
