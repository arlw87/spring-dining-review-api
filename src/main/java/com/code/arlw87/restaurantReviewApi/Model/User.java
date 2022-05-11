package com.code.arlw87.restaurantReviewApi.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="USERS")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="DISPLAY_NAME")
    private String displayName;

    @Column(name="CITY")
    private String city;

    @Column(name="COUNTY")
    private String county;

    @Column(name="POSTCODE")
    private String postCode;

    @Column(name="PEANUT_ALLERGY")
    private Boolean peanutAllergy;

    @Column(name="EGG_ALLERGY")
    private Boolean eggAllergy;

    @Column(name="DIARY_ALLERGY")
    private Boolean diaryAllergy;

    @OneToMany
    private Review reviews;

}
