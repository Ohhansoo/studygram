package org.studygram.studygram;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExamController {

    @RequestMapping ("/default")
    public String defulat() {
        return "default";
    }

    @RequestMapping ("/main")
    public String main() {
        return "index";
    }

    @RequestMapping ("/hello")
    public String hello() {
        return "hello";
    }
}
