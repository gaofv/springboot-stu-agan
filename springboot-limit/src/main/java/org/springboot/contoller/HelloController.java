package org.springboot.contoller;

import org.springboot.annotation.RateLimiter;
import org.springboot.constant.LimitType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ProjectName：springboot-stu-agan
 * @Package：org.springboot.contoller
 * @Description：
 * @Author：gaofei32419
 * @Date：2022/5/17 14:14
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    @RateLimiter(count = 2, time = 1, limitType = LimitType.IP)
    public String hello() {
        return "hello >>> " + new Date();
    }
}
