package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suchkov.api.dao.UserDao;
import ru.suchkov.api.model.mapper.MapperFacade;

@Service
public class UserServiceImpl implements UserService{

    private final MapperFacade mapperFacade;
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(MapperFacade mapperFacade, UserDao userDao) {
        this.mapperFacade = mapperFacade;
        this.userDao = userDao;
    }
}
