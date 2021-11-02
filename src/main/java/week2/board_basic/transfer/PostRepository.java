package week2.board_basic.transfer;

import org.springframework.data.repository.CrudRepository;
import week2.board_basic.model.Post;

public interface PostRepository extends CrudRepository<Post.PostObject, Integer> {
}
