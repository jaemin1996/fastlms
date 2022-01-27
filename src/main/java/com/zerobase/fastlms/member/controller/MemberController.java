package com.zerobase.fastlms.member.controller;

import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@Controller
public class MemberController {

    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @GetMapping("/member/register")
    public String register(){
        return "member/register";
    }

    //request  WEB -> SERVER
    //response  SERVER -> WEB

    @PostMapping("/member/register")
    public String registerSubmit(HttpServletRequest request, HttpServletResponse response
            , MemberInput parameter){

        System.out.println("############## -1");
        System.out.println(parameter.toString());

        Member member = new Member();
        member.setUserId(parameter.getUserId());
        member.setUserName(parameter.getUserName());
        member.setPhone(parameter.getPhone());
        member.setPassword(parameter.getPassword());
        member.setRegDt(LocalDateTime.now());
        memberRepository.save(member);

        return "member/register_complete";
    }

}
