package com.akash.spring_jpa_3.service;

import com.akash.spring_jpa_3.model.Author;
import com.akash.spring_jpa_3.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo authorRepo;

    @Transactional
    public void saveAuthorSubjects(Long Id, List<String> subjects) {
        Author author = authorRepo.findById(Id).orElseThrow(() -> new RuntimeException("Author not found"));

        author.setSubjects(subjects);
        authorRepo.save(author);
    }
}
