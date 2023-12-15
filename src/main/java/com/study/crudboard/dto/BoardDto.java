package com.study.crudboard.dto;

import java.time.LocalDateTime;

public class BoardDto {
    private Long no;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int adminViews;
    private int userViews;
    private int likes;
}
