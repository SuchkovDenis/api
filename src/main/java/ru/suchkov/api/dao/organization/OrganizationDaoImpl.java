package ru.suchkov.api.dao.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.Organization;

import javax.persistence.EntityManager;

/**
 * {@inheritDoc}
 */
@Repository
public class OrganizationDaoImpl implements OrganizationDao {
    private final EntityManager em;

    @Autowired
    public OrganizationDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritDoc}
     */
    public Organization findOrganizationById(long id) {
        return em.find(Organization.class, id);
    }
}
