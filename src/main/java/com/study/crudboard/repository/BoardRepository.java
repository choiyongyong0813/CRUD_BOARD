package com.study.crudboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BoardRepository extends JpaRepository<Board, String> {
}
