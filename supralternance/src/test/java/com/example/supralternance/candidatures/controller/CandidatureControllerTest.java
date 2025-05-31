package com.example.supralternance.candidatures.controller;

import com.example.supralternance.candidatures.model.Candidature;
import com.example.supralternance.service.CandidatureService;
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


@WebMvcTest(controllers = CandidatureController.class)
public class CandidatureControllerTest {

    @MockBean
    private CandidatureService candidatureService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @WithMockUser(username = "testuser", roles = {"USER"})
    void testGetCandidature() throws Exception {
        // Implémentez le test pour la méthode get
        Candidature candidature = new Candidature();
        candidature.setIdCandidature(1);

        candidature.setNomCandidature("Stage : patissier");

        Mockito.when(candidatureService.get(1)).thenReturn(candidature);

        mockMvc.perform(get("/candidatures/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idCandidature").value(1))
                .andExpect(jsonPath("$.nomCandidature").value("Stage : patissier"));
    }

    @Test
    @WithMockUser(username = "admin", roles = {"ADMIN"})
    void testInsertCandidature() throws Exception {
        // Implémentez le test pour la méthode insert
        Candidature candidature = new Candidature();
        candidature.setIdCandidature(2);
        candidature.setNomCandidature("Stage : patissier");

        when(candidatureService.insert(Mockito.any(Candidature.class))).thenReturn(candidature);

        mockMvc.perform(post("/candidatures").with(csrf())
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(candidature)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.idCandidature").value(2))
                .andExpect(jsonPath("$.nomCandidature").value("Stage : patissier"));
    }

}
