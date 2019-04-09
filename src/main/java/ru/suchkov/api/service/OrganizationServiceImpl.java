package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.suchkov.api.dao.organization.OrganizationDao;
import ru.suchkov.api.model.Organization;
import ru.suchkov.api.model.mapper.MapperFacade;
import ru.suchkov.api.view.OrganizationView;

@Service
public class OrganizationServiceImpl implements OrganizationService{

    private final MapperFacade mapperFacade;
    private final OrganizationDao organizationDao;

    @Autowired
    public OrganizationServiceImpl(MapperFacade mapperFacade, OrganizationDao organizationDao) {
        this.mapperFacade = mapperFacade;
        this.organizationDao = organizationDao;
    }

    @Override
    @Transactional
    public OrganizationView getOrganization(long id) {
        Organization organization = organizationDao.findOrganizationById(id);
        return mapperFacade.map(organization, OrganizationView.class);
    }
}