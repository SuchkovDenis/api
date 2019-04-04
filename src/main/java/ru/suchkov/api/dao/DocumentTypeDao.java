package ru.suchkov.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.DocumentType;

@Repository
public interface DocumentTypeDao extends CrudRepository<DocumentType, Long> {
}
