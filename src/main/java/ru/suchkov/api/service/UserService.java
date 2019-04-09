package ru.suchkov.api.service;

import ru.suchkov.api.view.UserView;

public interface UserService {

    UserView getUser(long id);
}
