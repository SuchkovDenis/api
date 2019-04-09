package ru.suchkov.api.dao.user;

import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.User;

/**
 * DAO для работы с User
 */
@Repository
public interface UserDao {
    /**
     * Получить объект Office по id
     *
     * @param id
     * @return
     */
    User findUserById(long id);
}
