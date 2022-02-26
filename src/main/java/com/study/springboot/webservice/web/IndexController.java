package com.study.springboot.webservice.web;

import com.study.springboot.webservice.config.auth.LoginUser;
import com.study.springboot.webservice.config.auth.dto.SessionUser;
import com.study.springboot.webservice.service.posts.PostsService;
import com.study.springboot.webservice.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    /*@LoginUser 추가하면 세션 null 오류*/
    /*
    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("posts", postsService.findAllDesc());

        SessionUser user = (SessionUser)httpSession.getAttribute("user");
        if(user != null){
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }
    */
    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {  // 1
        model.addAttribute("posts", postsService.findAllDesc());

        if(user != null) {
            model.addAttribute("userName", user.getName());
        }

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
