package com.example.board.module;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.board.Board;
import com.example.board.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
	List<Post> findByBoard(Board board);
}
