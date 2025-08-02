package com.akash.spring_jpa_3.model.mapping.many_to_many;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book_3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;

    @ManyToMany(mappedBy = "books")
    private List<Author_3> authors = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
