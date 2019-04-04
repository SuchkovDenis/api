package ru.suchkov.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

/**
 * Документ
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "Document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    /**
     * Номер документа
     */
    @Column(name = "number", length = 45, nullable = false)
    private String number;

    /**
     * Дата выдачи документа
     */
    @Column(name = "date", nullable = false)
    private Date date;
}
