package com.example.forsakringGirot.controller;

import com.example.forsakringGirot.dataAccess.ChiliFruit;
import com.example.forsakringGirot.service.ChiliFruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chilifruits")
public class ChiliFruitController {

    private final ChiliFruitService chiliFruitService;

    @Autowired
    public ChiliFruitController(ChiliFruitService chiliFruitService) {
        this.chiliFruitService = chiliFruitService;
    }

    @GetMapping
    public ResponseEntity<List<ChiliFruit>> getAllChiliFruits() {
        List<ChiliFruit> chiliFruits = chiliFruitService.getAllChiliFruits();
        return ResponseEntity.ok(chiliFruits);
    }

    @PostMapping("/{id}/updateQuantity")
    public ResponseEntity<String> updateQuantity(@PathVariable Long id, @RequestBody int newQuantity) {
        try {
            chiliFruitService.updateQuantity(id, newQuantity);
            return ResponseEntity.ok("Quantity updated successfully.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Chili fruit not found.");
        }
    }
}
