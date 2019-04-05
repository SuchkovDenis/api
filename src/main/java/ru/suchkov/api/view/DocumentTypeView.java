package ru.suchkov.api.view;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Тип документа")
public class DocumentTypeView {

    public String name;
    public String code;
}
