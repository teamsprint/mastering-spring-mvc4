package kr.co.hanbit.mastering.profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jhkim on 2017. 6. 12..
 */
@Controller
public class ProfileController {
    @RequestMapping("/profile")
    public String displayProfile() {
        return "profile/profilePage";
    }
}
