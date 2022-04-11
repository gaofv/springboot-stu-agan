package org.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.service
 * @Description：
 * @Author：GF
 * @Date：2022/4/10 16:02
 */
@Service
@Slf4j
public class AsyncService {

    @Async
    public void addScore() {
        try {
            Thread.sleep(1000 * 5);
            log.info("===添加积分成功===");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
