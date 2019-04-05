package ru.suchkov.api.service;

import ru.suchkov.api.view.DocumentTypeView;

import java.util.List;

public interface DocumentTypeService {

    /**
     * Получить список типов документов
     * @return список типов документов
     */
    List<DocumentTypeView> documentTypes();
}
