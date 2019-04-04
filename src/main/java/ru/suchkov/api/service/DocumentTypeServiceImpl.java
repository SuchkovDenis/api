package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suchkov.api.dao.DocumentTypeDao;
import ru.suchkov.api.model.mapper.MapperFacade;

@Service
public class DocumentTypeServiceImpl implements DocumentService{

    private final MapperFacade mapperFacade;
    private final DocumentTypeDao documentTypeDao;

    @Autowired
    public DocumentTypeServiceImpl(MapperFacade mapperFacade, DocumentTypeDao documentTypeDao) {
        this.mapperFacade = mapperFacade;
        this.documentTypeDao = documentTypeDao;
    }
}
