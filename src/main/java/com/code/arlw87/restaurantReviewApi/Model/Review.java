package com.code.arlw87.restaurantReviewApi.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="REVIEWS")
public class Review {

    @Id
    @GeneratedValue
    private Integer Id;

    @Column(name="REVIEW_SUBMITTED_BY")
    private String reviewSubmittedBy;

    @Column(name="RESTUARANT_REVIEWED_ID")
    private Integer restuarantReviewedId;

    @Column(name="PEANUT_SCORE")
    private Integer peanutScore;

    @Column(name="EGG_SCORE")
    private Integer eggScore;

    @Column(name="DIARY_SCORE")
    private Integer diaryScore;

    @Column(name="COMMENTS")
    private String comments;

    @OneToOne
    private User user;
}
