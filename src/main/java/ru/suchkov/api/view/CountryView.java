package ru.suchkov.api.view;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Страна")
public class CountryView {

    public String name;
    public String code;
}
