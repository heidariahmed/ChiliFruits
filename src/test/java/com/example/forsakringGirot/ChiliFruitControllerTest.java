package com.example.forsakringGirot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ChiliFruitControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetAllChiliFruits() throws Exception {
        mockMvc.perform(get("/api/chilifruits"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void testUpdateQuantity() throws Exception {
        Long chiliFruitId = 1L;
        int newQuantity = 50;

        mockMvc.perform(post("/api/chilifruits/" + chiliFruitId + "/updateQuantity")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(String.valueOf(newQuantity)))
                .andExpect(status().isOk());
    }
}
