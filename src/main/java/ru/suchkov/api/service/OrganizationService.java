package ru.suchkov.api.service;

import ru.suchkov.api.view.OrganizationView;


public interface OrganizationService {

    OrganizationView getOrganization(long id);
}
