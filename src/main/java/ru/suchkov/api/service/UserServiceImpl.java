package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suchkov.api.dao.user.UserDao;
import ru.suchkov.api.model.User;
import ru.suchkov.api.model.mapper.MapperFacade;
import ru.suchkov.api.view.UserView;

@Service
public class UserServiceImpl implements UserService{

    private final MapperFacade mapperFacade;
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(MapperFacade mapperFacade, UserDao userDao) {
        this.mapperFacade = mapperFacade;
        this.userDao = userDao;
    }

    @Override
    public UserView getUser(long id) {
        User user = userDao.findUserById(id);
        UserView userView = mapperFacade.map(user, UserView.class);
        if (user.getDocument() != null) {
            userView.setDocName(user.getDocument().getDocumentType().getName());
            userView.setDocNumber(user.getDocument().getNumber());
            userView.setDocDate(user.getDocument().getDate().toString());
        }
        if (user.getCountry() != null) {
            userView.setCitizenshipName(user.getCountry().getName());
            userView.setCitizenshipCode(user.getCountry().getCode().toString());
        }
        return userView;
    }
}