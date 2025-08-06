package com.akash.spring_security_2.model;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String providerId;
    private String name;
    private String email;
    private String provider;

    @Enumerated(EnumType.STRING)
    private Role role;
}


