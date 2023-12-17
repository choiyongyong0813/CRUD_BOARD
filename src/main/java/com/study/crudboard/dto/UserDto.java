package com.study.crudboard.dto;

import lombok.Data;

import javax.persistence.Column;
@Data
public class UserDto {
    private String id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private String phoneNumber;
}
