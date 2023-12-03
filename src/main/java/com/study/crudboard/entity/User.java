package com.study.crudboard.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter //자동으로 Getter 메서드를 생성
@Entity
@Builder //빌더 패턴을 지원
@DynamicUpdate //Hibernate에서 엔티티를 업데이트할 때 변경된 필드만 업데이트함
@AllArgsConstructor //모든 필드를 인자로 받는 생성자를 생성
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//파라미터가 없는 디폴트 생성자를 생성 access = AccessLevel.PROTECTED=생성자 접근제어수준을 protected로 설정


public class User {

    @Id//이 어노테이션을 사용함으로써 해당 컬럼은 데이터베이스의 primary key(기본키)로 사용됨
    @Column(name = "user_id", length = 50, nullable = false)
    //id라는 필드가 데이터베이스에서는 "user_id"라는 이름의 컬럼에 매핑되고,
    //길이는 50이며 null 값이 허용되지 않는다는 것을 나타냄
    private String id;

    @Column(name = "user_password", nullable = false)
    private String password;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "user_gender", nullable = false)
    private String gender;

    @Column(name = "user_email", nullable = false)
    private String email;

    @Column(name = "user_address", nullable = false)
    private String address;

    @Column(name = "user_phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "user_role", nullable = false)
    private String role;
}