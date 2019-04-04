package ru.suchkov.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.Organization;

@Repository
public interface OrganizationDao extends CrudRepository<Organization, Long> {
}
