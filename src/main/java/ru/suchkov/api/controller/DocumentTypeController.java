package ru.suchkov.api.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.suchkov.api.service.DocumentTypeService;

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
}
