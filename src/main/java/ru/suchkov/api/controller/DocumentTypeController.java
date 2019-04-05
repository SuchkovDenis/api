package ru.suchkov.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.suchkov.api.service.DocumentTypeService;
import ru.suchkov.api.view.DocumentTypeView;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api(value = "DocumentTypeController", description = "Получение справки по типам документов")
@RestController
@RequestMapping(value = "/", produces = APPLICATION_JSON_VALUE)
public class DocumentTypeController {

    private final DocumentTypeService documentTypeService;

    @Autowired
    public DocumentTypeController(DocumentTypeService documentTypeService) {
        this.documentTypeService = documentTypeService;
    }

    @ApiOperation(value = "Получить список всех типов документов", httpMethod = "GET")
    @GetMapping("/docs")
    public List<DocumentTypeView> persons() {
        return documentTypeService.documentTypes();
    }
}
