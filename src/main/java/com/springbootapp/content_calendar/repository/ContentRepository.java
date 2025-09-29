package com.springbootapp.content_calendar.repository;

import com.springbootapp.content_calendar.model.Content;
import com.springbootapp.content_calendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {

    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM Content 
            WHERE Status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status);
}
