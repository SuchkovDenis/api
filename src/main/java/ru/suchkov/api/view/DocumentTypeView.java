package ru.suchkov.api.view;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Тип документа")
@Data
public class DocumentTypeView {

    private String name;
    private String code;
}