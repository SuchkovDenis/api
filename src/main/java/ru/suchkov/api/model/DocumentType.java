package ru.suchkov.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Тип документа
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "Document_Type")
public class DocumentType {

    /**
     * Код документа
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Long code;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    /**
     * Название документа
     */
    @Column(name = "name", length = 45, nullable = false)
    private String name;
}
