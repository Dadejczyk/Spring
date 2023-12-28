package com.example.todoapp.model;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.net.ContentHandler;
import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    List<Task> findAll();
    Optional<Task> findById(Integer id);

    boolean existsById(Integer id);
    Task save(Task entity);
    Page<Task> findAll(Pageable pageable);
    List<Task> findByDone(@Param("state") boolean done);

}
