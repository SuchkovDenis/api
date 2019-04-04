package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suchkov.api.dao.DocumentDao;
import ru.suchkov.api.model.mapper.MapperFacade;

@Service
public class DocumentServiceImpl implements DocumentService{

    private final MapperFacade mapperFacade;
    private final DocumentDao documentDao;

    @Autowired
    public DocumentServiceImpl(MapperFacade mapperFacade, DocumentDao documentDao) {
        this.mapperFacade = mapperFacade;
        this.documentDao = documentDao;
    }
}
