package ru.suchkov.api.dao.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.Country;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * {@inheritDoc}
 */
@Repository
public class CountryDaoImpl implements CountryDao {

    private final EntityManager em;

    @Autowired
    public CountryDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Country> findAll() {
        TypedQuery<Country> query = em.createQuery("SELECT c FROM Country c", Country.class);
        return query.getResultList();
    }
}
