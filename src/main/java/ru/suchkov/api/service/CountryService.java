package ru.suchkov.api.service;

import ru.suchkov.api.view.CountryView;

import java.util.List;

public interface CountryService {

    /**
     * Получить список стран
     * @return список стран
     */
    List<CountryView> countries();
}
