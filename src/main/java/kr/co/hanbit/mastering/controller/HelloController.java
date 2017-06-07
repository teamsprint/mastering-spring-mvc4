package kr.co.hanbit.mastering.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jhkim on 2017. 6. 7..
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "resultPage";
    }

//    @RequestMapping("/error")
//    public String onError() {
//        return null;
//    }
}
