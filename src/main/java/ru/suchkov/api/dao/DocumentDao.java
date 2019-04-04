package ru.suchkov.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.Document;

@Repository
public interface DocumentDao extends CrudRepository<Document, Long> {
}
