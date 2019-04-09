package ru.suchkov.api.dao.office;

import ru.suchkov.api.model.Office;

/**
 * DAO для работы с Country
 */
public interface OfficeDao {
    /**
     * Получить объект Office по id
     *
     * @param id
     * @return
     */
    Office findOfficeById(long id);
}
