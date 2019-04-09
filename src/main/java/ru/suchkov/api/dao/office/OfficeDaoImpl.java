package ru.suchkov.api.dao.office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.Office;

import javax.persistence.EntityManager;

/**
 * {@inheritDoc}
 */
@Repository
public class OfficeDaoImpl implements OfficeDao {
    private final EntityManager em;

    @Autowired
    public OfficeDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
    * {@inheritDoc}
     */
    @Override
    public Office findOfficeById(long id) {
        return em.find(Office.class, id);
    }
}
