package com.code.arlw87.restaurantReviewApi.Model;

import javax.persistence.*;

import com.code.arlw87.restaurantReviewApi.ENUM.RestaurantType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="RESTAURANT")
public class Restaurant {

    @Id
    @GeneratedValue
    private Integer Id;

    @Column(name="NAME")
    private String name;

    @Column(name="CITY")
    private String city;

    @Column(name="COUNTY")
    private String county;

    @Column(name="POSTCODE")
    private String postcode;

    @Column(name="TYPE")
    @Enumerated(EnumType.STRING)
    private RestaurantType type;

    @Column(name="AMOUNT_OF_REVIEWS")
    private Integer amountOfReviews;

    @Column(name="TOTAL_SCORE")
    private Integer totalScore;

    @Column(name="PEANUT_SCORE")
    private Integer peanutScore;

    @Column(name="EGG_SCORE")
    private Integer eggScore;

    @Column(name="DIARY_SCORE")
    private Integer diaryScore;

}
