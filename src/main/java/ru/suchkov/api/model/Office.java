package ru.suchkov.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Офис
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "Office")
public class Office {

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
     * Название офиса
     */
    @Column(name = "name", length = 45)
    private String name;

    /**
     * Адрес офиса
     */
    @Column(name = "address", length = 225)
    private String address;

    /**
     * Телефон офиса
     */
    @Column(name = "phone", length = 15)
    private String phone;

    /**
     * Активность офиса в настоящий момент
     */
    @Column(name = "is_active")
    private boolean isActive;
}
