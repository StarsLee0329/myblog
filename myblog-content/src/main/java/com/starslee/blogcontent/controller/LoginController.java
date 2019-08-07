package com.starslee.blogcontent.controller;

import com.starslee.blogcontent.dto.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

    public ResponseResult login (){



        return new ResponseResult(1,"","");
    }

}
