package com.example.board.module;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.board.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
	Board findByName(String name);
}
