package dev.ruski.todoapp.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Instant;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private Instant createdAt;
    private Instant finishedAt;
    private Instant neededAt;
    private String title;
    private String description;


    // Constructor por defecto
    public Task() {
    }

    public Task(long id, String title, String description) {
        this.Id = id;
        this.neededAt = Instant.now();
        this.createdAt = Instant.now();
        this.finishedAt = null;
        this.title = title;
        this.description = description;
    }

    public Instant getNeededAt() {
        return neededAt;
    }

    public void setNeededAt(Instant neededAt) {
        this.neededAt = neededAt;
    }

    public long getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Instant finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
