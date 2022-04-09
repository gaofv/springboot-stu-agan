package org.springboot.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.contoller
 * @Description：
 * @Author：GF
 * @Date：2022/4/9 14:08
 */
@RestController
@ResponseBody
public class HelloController {

    @GetMapping(value = "hello")
    public String hello(){
        return "hello springboot";
    }
}
