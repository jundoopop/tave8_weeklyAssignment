package week2.board_basic.repository;

import week2.board_basic.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Post save(Post post);
    Optional<Post> findById(Long id);
    Optional<Post> findByName(String username);
//    Optional<Post> findByContent(String content);
    List<Post> findAll();
}
