package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suchkov.api.dao.OrganizationDao;
import ru.suchkov.api.model.mapper.MapperFacade;

@Service
public class OrganizationServiceImpl implements OrganizationService{

    private final MapperFacade mapperFacade;
    private final OrganizationDao organizationDao;

    @Autowired
    public OrganizationServiceImpl(MapperFacade mapperFacade, OrganizationDao organizationDao) {
        this.mapperFacade = mapperFacade;
        this.organizationDao = organizationDao;
    }
}
