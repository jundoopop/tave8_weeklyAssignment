package week2.board_basic.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import week2.board_basic.model.Post;
import week2.board_basic.service.PostingService;

import java.util.List;

@Controller
@SpringBootTest
public class ControllerTest {
    private final PostingService postingService;

    @Autowired
    public PostController(PostingService postingService) {
        this.postingService = postingService;
    }

    @GetMapping("/posting/editorForm")
    public String getForm() {
        return "posting/editorForm";
    }

    @PostMapping("/posting/editorForm")
    @Test
    public String getEdit(Model model, @ModelAttribute PostForm pf, String username, String password, String content) {
        model.addAttribute("username", pf.getUsername());
        model.addAttribute("password", pf.getPassword());
        model.addAttribute("content", pf.getContent());

        return "posting/postList";
    }

//    @GetMapping("/members")
//    public String list(Model model) {
//        List<Post> members = postingService.;
//        model.addAttribute("members", members);
//        return "members/memberList";
//    }


}
