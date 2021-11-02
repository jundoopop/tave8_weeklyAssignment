package week2.board_basic.upload;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Edit {

    @GetMapping("/formEditor")
    public String loadEditor(Model model) {
        model.addAttribute("pf", new PostForm());
        return "posting/formEditor";
    }


    @PostMapping("/")
    public String submitPost() {
        return "posting/succeed";
    }
}
