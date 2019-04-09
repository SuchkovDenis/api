package ru.suchkov.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.Office;

@Repository
public interface OfficeDao extends CrudRepository<Office, Long> {

    Office findOfficeById(long id);
}
