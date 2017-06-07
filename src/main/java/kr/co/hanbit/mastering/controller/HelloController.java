package kr.co.hanbit.mastering.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jhkim on 2017. 6. 7..
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello(@RequestParam(defaultValue = "world!") String userName, Model model) {
        model.addAttribute("message", "Hello " + userName);
        return "resultPage";
    }
}
