package ru.suchkov.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.suchkov.api.model.Country;

import java.util.List;

@Repository
public interface CountryDao extends CrudRepository<Country, Long> {

    List<Country> findAll();
}
