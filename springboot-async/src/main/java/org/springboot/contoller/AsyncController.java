package org.springboot.contoller;

import lombok.extern.slf4j.Slf4j;
import org.springboot.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.contoller
 * @Description：
 * @Author：GF
 * @Date：2022/4/10 15:49
 */
@RestController
@Slf4j
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("register")
    public String registerUser() {
        log.info("===注册用户成功===");
        asyncService.addScore();
        return "success";
    }
}
