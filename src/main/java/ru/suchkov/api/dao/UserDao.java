package ru.suchkov.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
}