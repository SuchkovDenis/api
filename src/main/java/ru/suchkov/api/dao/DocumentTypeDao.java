package ru.suchkov.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.DocumentType;

import java.util.List;

@Repository
public interface DocumentTypeDao extends CrudRepository<DocumentType, Long> {

    List<DocumentType> findAll();
}
