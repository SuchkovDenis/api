package ru.suchkov.api.dao.doctype;

import ru.suchkov.api.model.DocumentType;

import java.util.List;

/**
 * DAO для работы с Country
 */
public interface DocumentTypeDao {
    /**
     * Получить все объекты DocumentType
     *
     * @return
     */
    List<DocumentType> findAll();
}
