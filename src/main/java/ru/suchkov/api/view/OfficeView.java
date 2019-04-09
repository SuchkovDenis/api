package ru.suchkov.api.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Офис")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfficeView {

    private String id;
    private String name;
    private String address;
    private String phone;
    private String isActive;
}