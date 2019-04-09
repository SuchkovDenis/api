package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.suchkov.api.dao.doctype.DocumentTypeDao;
import ru.suchkov.api.model.DocumentType;
import ru.suchkov.api.model.mapper.MapperFacade;
import ru.suchkov.api.view.DocumentTypeView;

import java.util.List;

@Service
public class DocumentTypeServiceImpl implements DocumentTypeService{

    private final MapperFacade mapperFacade;
    private final DocumentTypeDao documentTypeDao;

    @Autowired
    public DocumentTypeServiceImpl(MapperFacade mapperFacade, DocumentTypeDao documentTypeDao) {
        this.mapperFacade = mapperFacade;
        this.documentTypeDao = documentTypeDao;
    }

    @Override
    @Transactional
    public List<DocumentTypeView> documentTypes() {
        List<DocumentType> all = documentTypeDao.findAll();
        return mapperFacade.mapAsList(all, DocumentTypeView.class);
    }
}
