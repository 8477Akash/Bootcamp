package com.akash.spring_jpa_3.model.mapping.one_to_many;

import jakarta.persistence.*;

@Entity
public class Book_2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;


    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author_2 author;

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
