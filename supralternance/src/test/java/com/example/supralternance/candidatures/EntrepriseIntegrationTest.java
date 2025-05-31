package com.example.supralternance.candidatures;

import com.example.supralternance.candidatures.model.Entreprise;
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
public class EntrepriseIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testInsertAndGetEntreprise() throws Exception {
        // Création d'une entreprise
        Entreprise entreprise = new Entreprise();
        entreprise.setNom("Boulangerie Artisanale");

        // POST
        String response = mockMvc.perform(post("/entreprises")
                        .with(user("testuser").roles("USER"))
                        .with(csrf())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(entreprise)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idEntreprise").exists())
                .andExpect(jsonPath("$.nom").value("Boulangerie Artisanale"))
                .andReturn().getResponse().getContentAsString();


        Entreprise saved = objectMapper.readValue(response, Entreprise.class);
        Integer id = saved.getIdEntreprise();

        // GET
        mockMvc.perform(get("/entreprises/" + id).with(user("testuser").roles("USER")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idEntreprise").value(id))
                .andExpect(jsonPath("$.nom").value("Boulangerie Artisanale"));


    }
}
