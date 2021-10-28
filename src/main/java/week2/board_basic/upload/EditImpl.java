package week2.board_basic.upload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class EditImpl implements Edit{
    @Override
    @GetMapping
    public String loadEditor() {
        return null;
    }

    @Override
    @PostMapping
    public String submitPost() {
        return null;
    }
}
