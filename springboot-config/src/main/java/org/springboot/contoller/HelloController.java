package org.springboot.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.config.DataSourceProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.dnd.DropTarget;

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

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Value("${random.uuid}")
    public String randUUID;

    @Autowired
    private DataSourceProps dataSourceProps;


    @GetMapping(value = "hello")
    public String hello() {
        return "hello springboot";
    }

    @GetMapping(value = "getConfigInfo")
    public String getConfigInfo() {
        logger.info("config = {}", randUUID);
        return randUUID;
    }

    @GetMapping(value = "getConfigInfo2")
    public String getConfigInfo2() {
        logger.info("config = {}", dataSourceProps.toString());
        return dataSourceProps.toString();
    }

}
