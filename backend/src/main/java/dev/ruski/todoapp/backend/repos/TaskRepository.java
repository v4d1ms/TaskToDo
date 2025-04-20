package dev.ruski.todoapp.backend.repos;

import dev.ruski.todoapp.backend.entities.Task;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Id> {
}
