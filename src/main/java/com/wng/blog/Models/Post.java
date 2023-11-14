package com.wng.blog.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, anons,fullText;
    private int views;

    public Post(String title, String anons, String fullText) {
        this.title = title;
        this.anons = anons;
        this.fullText = fullText;
    }
}



