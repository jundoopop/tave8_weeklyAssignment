package week2.board_basic.repository;

import week2.board_basic.model.Post;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaPostRepository implements PostRepository {

    private final EntityManager em;

    public JpaPostRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Post save(Post post) {
        em.persist(post);
        return post;
    }

    @Override
    public Optional<Post> findById(Long id) {
        Post post = em.find(Post.class, id);
        return Optional.ofNullable(post);
    }

    @Override
    public Optional<Post> findByName(String username) {
        List<Post> result = em.createQuery("select post from Post post where post.username = :username", Post.class)
                .setParameter("username", username)
                .getResultList();
        return result.stream().findAny();
    }

//    @Override
//    public Optional<Post> findByContent(String content) {
//        return Optional.empty();
//    }

    @Override
    public List<Post> findAll() {
        return em.createQuery("select post from Post post", Post.class)
                .getResultList();
    }
}
