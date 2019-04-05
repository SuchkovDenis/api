package ru.suchkov.api.view;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Страна")
@Data
public class CountryView {

    private String name;
    private String code;
}