package com.example.FieldFinder.dto.req;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ReviewRequestDTO {
    private UUID pitchId;
    private UUID userId;
    private int rating;
    private String comment;
}
