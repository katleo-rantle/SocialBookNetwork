package com.katleo.book.user;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Token {
    @Id
    @GeneratedValue
    private Integer id;
    private String token;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;
    private LocalDateTime validatedAt;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private User user;
}
