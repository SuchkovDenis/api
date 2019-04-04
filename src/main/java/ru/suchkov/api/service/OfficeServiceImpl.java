package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suchkov.api.dao.OfficeDao;
import ru.suchkov.api.model.mapper.MapperFacade;

@Service
public class OfficeServiceImpl implements OfficeService{

    private final MapperFacade mapperFacade;
    private final OfficeDao officeDao;

    @Autowired
    public OfficeServiceImpl(MapperFacade mapperFacade, OfficeDao officeDao) {
        this.mapperFacade = mapperFacade;
        this.officeDao = officeDao;
    }
}
