package week2.board_basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import week2.board_basic.model.Post;
import week2.board_basic.service.PostingService;

import java.util.List;

@Controller
public class PostController {
    private final PostingService postingService;

    @Autowired
    public PostController(PostingService postingService) {
        this.postingService = postingService;
    }

    @GetMapping("newpost")
    public String getEdit(Model model, @ModelAttribute PostForm pf, String username, String password, String content) {
        model.addAttribute("username", pf.getUsername());
        model.addAttribute("password", pf.getPassword());
        model.addAttribute("content", pf.getContent());

        return "posting/editorForm";
    }

//    @GetMapping("/members")
//    public String list(Model model) {
//        List<Post> members = postingService.;
//        model.addAttribute("members", members);
//        return "members/memberList";
//    }


}
