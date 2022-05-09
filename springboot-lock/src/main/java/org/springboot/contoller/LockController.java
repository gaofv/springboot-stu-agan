package org.springboot.contoller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springboot.entity.ApplicationInfo;
import org.springboot.service.ApplicationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.contoller
 * @Description：
 * @Author：GF
 * @Date：2022/4/11 19:50
 */
@RestController
@Slf4j
@Api(tags = {"用户相关接口"}, protocols = "HTTP", produces = "application/json", consumes = "text/html")
public class LockController {

    @Autowired
    private ApplicationInfoService appService;


    @PostMapping("userRegister")
//    @ApiOperation()
    @ApiOperation(value = "register")
    public void userRegister() {
        log.info("==注册用户==");
    }

    @GetMapping("userLogin")
    @ApiOperation(value = "登录简要描述", notes = "登录详细描述", tags = "登录模块", httpMethod = "GET")
    public void userLogin(String userId) {
        log.info("==用户登录==,userId={}", userId);
    }


    @PostMapping("/postAppInfo")
    @ApiOperation(value = "新增应用", notes = "新增应用接口", httpMethod = "POST")
    public void postAppInfo(@RequestBody ApplicationInfo appInfo) {
        appService.addApplication(appInfo);
    }

    @PostMapping("/putAppInfo")
    @ApiOperation(value = "修改应用")
    public void putAppInfo(@RequestBody ApplicationInfo appInfo) {
        appService.updateApplication(appInfo);
    }

    @PostMapping("/deleteAppInfo")
    @ApiOperation(value = "删除应用")
    public void deleteAppInfo(@RequestParam String appKey) {
        appService.removeApplication(appKey);
    }

    @GetMapping("/getAppList")
    @ApiOperation(value = "查询应用列表")
    public List<ApplicationInfo> getAppList(@RequestParam(required = false) String appName) {
        return appService.getList(appName);
    }

    @GetMapping("/getAppDetailInfo")
    @ApiOperation(value = "查询应用详情")
    public ApplicationInfo getAppDetailInfo(@RequestParam String appKey) {
        return appService.getOne(appKey);
    }
}
