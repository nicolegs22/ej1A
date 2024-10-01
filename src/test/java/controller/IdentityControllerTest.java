// src/test/java/com/example/identityservice/controller/IdentityControllerTest.java
package com.example.identityservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class IdentityControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testVerifyIdentity() throws Exception {
        mockMvc.perform(get("/identity/exists/123456"))
                .andExpect(status().isOk())
                .andExpect(content().string("true"));

        mockMvc.perform(get("/identity/exists/654321"))
                .andExpect(status().isOk())
                .andExpect(content().string("false"));
    }
}
