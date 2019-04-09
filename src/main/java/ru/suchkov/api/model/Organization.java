package ru.suchkov.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Организация
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "Organization")
public class Organization {

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
     * Название организации
     */
    @Column(name = "name", length = 45, nullable = false)
    private String name;

    /**
     * Полное название организации
     */
    @Column(name = "full_name", length = 225)
    private String fullName;

    /**
     * ИНН организации
     */
    @Column(name = "inn", length = 45)
    private String inn;

    /**
     * КПП организации
     */
    @Column(name = "kpp", length = 45)
    private String kpp;

    /**
     * Адрес организации
     */
    @Column(name = "address", length = 225)
    private String address;

    /**
     * Телефон организации
     */
    @Column(name = "phone", length = 15)
    private String phone;

    /**
     * Активность организации в настоящий момент
     */
    @Column(name = "is_active")
    private Boolean isActive;
}
