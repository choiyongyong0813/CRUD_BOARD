package com.study.crudboard.dao;

import com.study.crudboard.dto.UserDto;

import java.util.List;

public interface UserDao {
    // 데이터 생성
    UserDto create(UserDto userDto);

    // 주어진 id에 해당하는 데이터 조회
    UserDto findById(String id);

    // 모든 데이터 조회
    List<UserDto> findAll();

    // 데이터 수정
    UserDto update(UserDto userDto);

    // 주어진 id에 해당하는 데이터 삭제
    void delete(String id);
}
