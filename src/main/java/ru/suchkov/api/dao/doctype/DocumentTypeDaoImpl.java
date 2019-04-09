package ru.suchkov.api.dao.doctype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.DocumentType;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * {@inheritDoc}
 */
@Repository
public class DocumentTypeDaoImpl implements DocumentTypeDao {
    private final EntityManager em;

    @Autowired
    public DocumentTypeDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<DocumentType> findAll() {
        TypedQuery<DocumentType> query = em.createQuery("SELECT d FROM DocumentType d", DocumentType.class);
        return query.getResultList();
    }
}