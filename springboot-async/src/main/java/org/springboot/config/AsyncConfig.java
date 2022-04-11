package org.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.config
 * @Description：
 * @Author：GF
 * @Date：2022/4/10 16:00
 */
@EnableAsync
@Configuration
public class AsyncConfig {

    @Bean
    public ThreadPoolTaskExecutor taskExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //核心线程数
        taskExecutor.setCorePoolSize(10);
        //线程池的最大数量，只有当队列满了之后才会申请超过核心线程数的线程
        taskExecutor.setMaxPoolSize(100);
        //缓存队列
        taskExecutor.setQueueCapacity(50);
        //空闲时间，核心线程数之外的线程达到空闲时间时会被销毁
        taskExecutor.setKeepAliveSeconds(200);
        //线程名称前缀
        taskExecutor.setThreadNamePrefix("task-executor");
        //当线程池已满，且达到maxPoolSize时，如果还有任务进来，就会采取任务拒绝策略
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        taskExecutor.initialize();
        return taskExecutor;
    }
}
