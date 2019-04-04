package ru.suchkov.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Страна
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "Country")
public class Country {

    /**
     * Код страны
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code")
    private Long id;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    /**
     * Название страны
     */
    @Column(name = "name", length = 45, nullable = false)
    private String name;
}