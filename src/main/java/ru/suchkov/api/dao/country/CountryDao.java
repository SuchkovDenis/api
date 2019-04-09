package ru.suchkov.api.dao.country;

import ru.suchkov.api.model.Country;

import java.util.List;

/**
 * DAO для работы с Country
 */
public interface CountryDao {
    /**
     * Получить все объекты Country
     *
     * @return
     */
    List<Country> findAll();
}
