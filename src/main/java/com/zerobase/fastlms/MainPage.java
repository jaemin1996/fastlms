package com.zerobase.fastlms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @RequestMapping("/")
    public String index(){
        return "Index Page";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        String msg = "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "<p>hello</p> <p>fastlms website!!!</p>" +
                "</body>" +
                "</html>";
        return msg;
    }
}
