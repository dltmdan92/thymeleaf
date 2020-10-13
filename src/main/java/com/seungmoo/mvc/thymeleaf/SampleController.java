package com.seungmoo.mvc.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "seungmoo");
        // 여기서 리턴하는 "hello"는 response 본문이 아니다.(RestController가 아닌 Controller이기 때문)
        // view 이름을 리턴함함
       return "hello";
    }
}
