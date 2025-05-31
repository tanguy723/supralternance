package com.example.supralternance.candidatures.controller;
import com.example.supralternance.candidatures.model.Candidature;
import com.example.supralternance.candidatures.model.CandidatureSpontanee;
import com.example.supralternance.candidatures.model.Entreprise;
import com.example.supralternance.service.CandidatureService;
import com.example.supralternance.service.CandidatureSpontaneeService;
import com.example.supralternance.service.EntrepriseService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(controllers = EntrepriseController.class)
public class EntrepriseControllerTest {

    @MockBean
    private EntrepriseService entrepriseService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @WithMockUser(username = "testuser", roles = {"USER"})
    void testGetEntreprise() throws Exception {
        // Implémentez le test pour la méthode get
        Entreprise entreprise = new Entreprise();
        entreprise.setIdEntreprise(1);
        entreprise.setNom("Pattisserie Gourmet");

        Mockito.when(entrepriseService.get(1)).thenReturn(entreprise);

        mockMvc.perform(get("/entreprises/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idEntreprise").value(1))
                .andExpect(jsonPath("$.nom").value("Pattisserie Gourmet"));
    }

    @Test
    @WithMockUser(username = "admin", roles = {"ADMIN"})
    void testInsertEntreprise() throws Exception {
        // Implémentez le test pour la méthode insert
        Entreprise entreprise = new Entreprise();
        entreprise.setIdEntreprise(2);
        entreprise.setNom("Pattisserie Gourmet");

        when(entrepriseService.insert(Mockito.any(Entreprise.class))).thenReturn(entreprise);

        mockMvc.perform(post("/entreprises").with(csrf())
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(entreprise)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idEntreprise").value(2))
                .andExpect(jsonPath("$.nom").value("Pattisserie Gourmet"));
    }



}
