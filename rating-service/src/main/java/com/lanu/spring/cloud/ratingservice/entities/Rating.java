package com.lanu.spring.cloud.ratingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rating {
    private Long id;
    private Long bookId;
    private int stars;
}
