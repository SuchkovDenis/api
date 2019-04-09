package ru.suchkov.api.dao.organization;

import ru.suchkov.api.model.Organization;

/**
 * DAO для работы с Organization
 */
public interface OrganizationDao {
    /**
     * Получить объект Office по id
     *
     * @param id
     * @return
     */
    Organization findOrganizationById(long id);
}
