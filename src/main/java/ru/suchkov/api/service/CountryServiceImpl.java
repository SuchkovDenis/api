package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suchkov.api.dao.CountryDao;
import ru.suchkov.api.model.mapper.MapperFacade;

@Service
public class CountryServiceImpl implements CountryService{

    private final MapperFacade mapperFacade;
    private final CountryDao countryDao;

    @Autowired
    public CountryServiceImpl(MapperFacade mapperFacade, CountryDao countryDao) {
        this.mapperFacade = mapperFacade;
        this.countryDao = countryDao;
    }
}
