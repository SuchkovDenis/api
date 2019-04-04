package ru.suchkov.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Сотрудник
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {

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
     * Имя сотрудника
     */
    @Column(name = "first_name", length = 45, nullable = false)
    private String firstName;

    /**
     * Имя сотрудника
     */
    @Column(name = "last_name", length = 45, nullable = false)
    private String lastName;

    /**
     * Имя сотрудника
     */
    @Column(name = "middle_name", length = 45, nullable = false)
    private String middleName;

    /**
     * Занимаемая должность
     */
    @Column(name = "position", length = 45)
    private String position;

    /**
     * Телефон сотрудника
     */
    @Column(name = "phone", length = 15)
    private String phone;

    /**
     * Идентифицирован ли сотрудник
     */
    @Column(name = "is_identified", columnDefinition = "TINYINT(1)")
    private boolean isIdentified;
}
