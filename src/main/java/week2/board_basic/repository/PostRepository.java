package week2.board_basic.repository;

import org.springframework.data.repository.CrudRepository;
import week2.board_basic.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findByUsername(String username);

    List<Post> findByContent(String content);
}
