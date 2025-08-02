package com.akash.spring_jpa_3.controller;

import com.akash.spring_jpa_3.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/{id}/subjects")
    public ResponseEntity<String> addSubjects(
            @PathVariable Long id,
            @RequestBody List<String> subjects) {
        authorService.saveAuthorSubjects(id, subjects);
        return ResponseEntity.ok("Subjects saved for Author ID: " + id);
    }
}

