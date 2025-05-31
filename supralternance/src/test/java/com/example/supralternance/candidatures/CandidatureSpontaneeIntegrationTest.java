package com.example.supralternance.candidatures;


import com.example.supralternance.candidatures.model.CandidatureSpontanee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class CandidatureSpontaneeIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testInsertAndGetCandidatureSpontanee() throws Exception {
        // Création d'une candidature
        CandidatureSpontanee candidature = new CandidatureSpontanee();
        candidature.setNomCandidature("Artisan boulanger");

        // POST
        String response = mockMvc.perform(post("/candidatures/spontanees")
                        .with(user("testuser").roles("USER"))
                        .with(csrf())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(candidature)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idCandidature").exists())
                .andExpect(jsonPath("$.nomCandidature").value("Artisan boulanger"))
                .andReturn().getResponse().getContentAsString();


        CandidatureSpontanee saved = objectMapper.readValue(response, CandidatureSpontanee.class);
        Integer id = saved.getIdCandidature();

        // GET
        mockMvc.perform(get("/candidatures/spontanees/" + id).with(user("testuser").roles("USER")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idCandidature").value(id))
                .andExpect(jsonPath("$.nomCandidature").value("Artisan boulanger"));


    }
}
