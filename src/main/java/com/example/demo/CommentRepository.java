package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bhuridech Sudsee.
 */
public interface CommentRepository extends CrudRepository<Comment,Long> {
}
