package week2.board_basic.service;

import org.junit.jupiter.api.Test;
import week2.board_basic.model.Post;

import javax.persistence.EntityManager;

public class PostServiceTest {

    private EntityManager em;

    private final postRepositoryImpl postRepository = new postRepositoryImpl(em);

    @Test
    public void save() {
        Post post = new Post();
        post.setUsername("aa");
        post.setPassword("aaaa");
        post.setContent("no content");

        postRepository.save(post);
    }


}
