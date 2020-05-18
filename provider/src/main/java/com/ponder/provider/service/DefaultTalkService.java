package com.ponder.provider.service;

import com.ponder.dubbotemplate.service.TalkService;
import org.apache.dubbo.config.annotation.Service;

import java.util.Date;

/**
 * @auth ponder
 * @Email gponder.g@gmail.com
 * @create 2020/5/14 21:31
 */
@Service(version = "${demo.service.version}")
public class DefaultTalkService implements TalkService {

    @Override
    public String say(String words) {
        return "provider: "+words +", too "+new Date();
    }

}
