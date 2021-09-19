package week2.board_basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import week2.board_basic.repository.PostRepository;

@Service
public class PostingService {

    private final PostRepository postRepository;

    @Autowired
    public PostingService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
