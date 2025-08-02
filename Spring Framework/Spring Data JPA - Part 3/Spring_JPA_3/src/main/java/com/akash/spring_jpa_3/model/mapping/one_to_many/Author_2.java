package com.akash.spring_jpa_3.model.mapping.one_to_many;


import com.akash.spring_jpa_3.model.Address;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author_2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @ElementCollection
    private List<String> subjects = new ArrayList<>();
//    //Unidirectional
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "author_id")
//    private List<Book_2> books = new ArrayList<>();

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book_2> books = new ArrayList<>();

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
