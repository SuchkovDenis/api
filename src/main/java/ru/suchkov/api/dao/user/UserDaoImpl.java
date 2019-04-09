package ru.suchkov.api.dao.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.User;

import javax.persistence.EntityManager;

/**
 * {@inheritDoc}
 */
@Repository
public class UserDaoImpl implements UserDao {
    private final EntityManager em;

    @Autowired
    public UserDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User findUserById(long id) {
        return em.find(User.class, id);
    }
}
