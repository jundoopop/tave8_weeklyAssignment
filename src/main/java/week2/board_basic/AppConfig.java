package week2.board_basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import week2.board_basic.controller.PostForm;
import week2.board_basic.repository.PostRepository;
import week2.board_basic.service.PostingService;

import javax.persistence.EntityManager;
import java.util.Optional;

@Configuration
public class AppConfig {

    private EntityManager em;
    private PostRepository pr;
    private PostForm pf;

    public AppConfig(EntityManager em, PostRepository pr, PostForm pf) {
        this.em = em;
        this.pr = pr;
        this.pf = pf;
    }

    @Bean
    public PostingService PostingService() {
        return new PostingService(pf);
    }

    @Bean
    public PostRepository postRepository() {
        return null;
    }

    @Bean
    public PostForm postForm() {

    }

}
