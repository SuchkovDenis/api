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
    private String secondName;

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
    @Column(name = "is_identified")
    private Boolean isIdentified;

    /**
     * Документ сотрудника
     */
    @OneToOne
    @JoinColumn(name="document_id")
    private Document document;

    /**
     * Страна сотрудника
     */
    @OneToOne
    @JoinColumn(name="citizenship_code")
    private Country country;

    /**
     * Страна сотрудника
     */
    @OneToOne
    @JoinColumn(name="office_id")
    private Office office;
}
