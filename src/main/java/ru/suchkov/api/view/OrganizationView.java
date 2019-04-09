package ru.suchkov.api.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Организация")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrganizationView {

    private String id;
    private String name;
    private String fullName;
    private String inn;
    private String kpp;
    private String address;
    private String phone;
    private String isActive;
}
