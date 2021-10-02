package week2.board_basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import week2.board_basic.controller.PostForm;
import week2.board_basic.model.Post;

@Service
public class PostingService {

    private Post post = new Post();

    @Autowired
    public PostingService(PostForm postForm) {
        post.setUsername(postForm.getUsername());
        post.setPassword(postForm.getPassword());
        post.setContent(postForm.getContent());
    }

    public Long posting(PostForm postFormImpl) {

    }


}
