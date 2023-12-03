package com.study.crudboard.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "board_no", nullable = false)
    private Long no;

    @Column(name = "board_title", nullable = false)
    private String title;

    @Column(name = "board_content", columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(name = "board_created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "board_updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "board_admin_views", nullable = false)
    private int adminViews;

    @Column(name = "board_user_views", nullable = false)
    private int userViews;

    @Column(name = "board_likes", nullable = false)
    private int likes;

    @Enumerated(EnumType.STRING) //EnumType.STRING을 사용하여 Enum 타입의 필드를 문자열로 매핑
    @ManyToOne(fetch = FetchType.LAZY) //다대일(N:1) 관계를, 여러 개의 Board 엔티티가 하나의 User 엔티티에 속함
    @JoinColumn(name = "user_id", nullable = false) //외래 키(Foreign Key)를 지정
    private User user;

}
