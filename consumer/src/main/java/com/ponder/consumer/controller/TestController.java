package com.ponder.consumer.controller;

import com.ponder.dubbotemplate.service.TalkService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/5/15 20:17
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Reference(version = "${demo.service.version}")
    private TalkService talkService;

    @GetMapping("say")
    private String dubboSay(){
        return talkService.say("hello");
    }

}
