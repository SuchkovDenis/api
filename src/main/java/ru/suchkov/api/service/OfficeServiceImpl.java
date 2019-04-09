package ru.suchkov.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suchkov.api.dao.OfficeDao;
import ru.suchkov.api.model.Office;
import ru.suchkov.api.model.mapper.MapperFacade;
import ru.suchkov.api.view.OfficeView;

@Service
public class OfficeServiceImpl implements OfficeService{

    private final MapperFacade mapperFacade;
    private final OfficeDao officeDao;

    @Autowired
    public OfficeServiceImpl(MapperFacade mapperFacade, OfficeDao officeDao) {
        this.mapperFacade = mapperFacade;
        this.officeDao = officeDao;
    }

    @Override
    public OfficeView getOffice(long id) {
        Office office = officeDao.findOfficeById(id);
        return mapperFacade.map(office, OfficeView.class);
    }
}
