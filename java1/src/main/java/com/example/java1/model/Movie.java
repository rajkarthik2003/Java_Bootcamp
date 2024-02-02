package com.example.java1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Movie {
    @Id
    private String id;

    @Column
    private String title; // changed from author to title

    @Column
    private String director; // changed from publisher to director

    public Movie() {

    }

    public Movie(String id, String title, String director) {
        this.id = id;
        this.title = title;
        this.director = director;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
