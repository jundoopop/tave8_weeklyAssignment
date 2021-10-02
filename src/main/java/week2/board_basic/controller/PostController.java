package week2.board_basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import week2.board_basic.service.PostingService;

@Controller
public class PostController {
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
    public String getEdit(Model model, @ModelAttribute PostForm pf, String username, String password, String content) {
        model.addAttribute("username", pf.getUsername());
        model.addAttribute("password", pf.getPassword());
        model.addAttribute("content", pf.getContent());

        return "posting/postList";
    }



}

