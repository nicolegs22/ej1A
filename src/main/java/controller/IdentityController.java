// src/main/java/com/example/identityservice/controller/IdentityController.java
package com.example.identityservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/identity")
public class IdentityController {

    @GetMapping("/exists/{ci}")
    public boolean verifyIdentity(@PathVariable String ci) {
        // Aquí puedes implementar la lógica real de verificación
        // Para el ejemplo, simplemente devolveremos true si el CI es "123456"
        return "123456".equals(ci);
    }
}
