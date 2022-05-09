package org.springboot.contoller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.contoller
 * @Description：
 * @Author：GF
 * @Date：2022/4/11 19:50
 */
@RestController
@Slf4j
@Api(tags = {"用户相关接口"}, protocols = "HTTP",produces = "application/json",consumes = "text/html")
public class SwaggerController {

    @PostMapping("userRegister")
//    @ApiOperation()
    @ApiOperation(value = "register")
    public void userRegister() {
        log.info("==注册用户==");
    }

    @GetMapping("userLogin")
    @ApiOperation(value = "登录简要描述",notes = "登录详细描述",tags = "登录模块",httpMethod = "GET")
    public void userLogin(String userId) {
        log.info("==用户登录==,userId={}", userId);
    }
}
