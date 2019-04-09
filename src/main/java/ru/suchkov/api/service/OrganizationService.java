package ru.suchkov.api.service;

import ru.suchkov.api.model.Organization;
import ru.suchkov.api.view.OrganizationView;

import java.util.List;

public interface OrganizationService {

    List<OrganizationView> getOrganizations();

    OrganizationView getOrganization(long id);

    OrganizationView updateOrganization(Organization organization);

    OrganizationView saveOrganization(Organization organization);

}
