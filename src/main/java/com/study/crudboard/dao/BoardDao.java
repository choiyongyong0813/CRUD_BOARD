package com.study.crudboard.dao;

import com.study.crudboard.dto.BoardDto;

import java.util.List;

public interface BoardDao {
    // 데이터 생성
    BoardDto create(BoardDto boardDto);

    // 주어진 id에 해당하는 데이터 조회
    BoardDto findById(Long no);

    // 모든 데이터 조회
    List<BoardDto> findAll();

    // 데이터 수정
    BoardDto update(BoardDto boardDto);

    // 주어진 id에 해당하는 데이터 삭제
    void delete(Long no);
}
