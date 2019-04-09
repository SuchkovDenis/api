package ru.suchkov.api.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Сотрудник")
@Data
// @JsonInclude(JsonInclude.Include.NON_NULL)
public class UserView {

    private String id;
    private String firstName;
    private String secondName;
    private String middleName;
    private String position;
    private String phone;
    private String docName;
    private String docNumber;
    private String docDate;
    private String citizenshipName;
    private String citizenshipCode;
    private String isIdentified;
}
