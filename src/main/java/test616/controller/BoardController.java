package test616.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BoardController {

    //1.메인페이지 이동 매핑
    @GetMapping("/main")
    public String main(){

        return "main";
    }


}
