package week2.board_basic.repository;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import week2.board_basic.BoardBasicApplication;
import week2.board_basic.model.Post;
import org.slf4j.Logger;


class RepositoryTest {

    private static final Logger log = LoggerFactory.getLogger(BoardBasicApplication.class);

    public String divLine = "-------------------------------------------";

    @Test
    public CommandLineRunner saveToDB(PostRepository pr) {
        return (args) -> {
            pr.save(new Post("username", "password", "content"));

            log.info("using findAll()");
            log.info(divLine);
            for (Post post : pr.findAll()) {
                log.info(post.toString());
            }

        };
    }


}
