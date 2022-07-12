package org.springboot.annotation;

import org.springboot.constant.LimitType;

import java.lang.annotation.*;

/**
 * @ProjectName：springboot-stu-agan
 * @Package：org.springboot.annotation
 * @Description：限流注解
 * @Author：gaofei32419
 * @Date：2022/5/17 12:58
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RateLimiter {
    /**
     * 限流key
     *
     * @return
     */
    String key() default "rate_limit:";

    /**
     * 限流次数60次
     *
     * @return
     */
    int count() default 100;

    /**
     * 限流时间，默认60s
     *
     * @return
     */
    int time() default 60;

    /**
     * 限流类型，默认为全局限流策略
     *
     * @return
     */
    LimitType limitType() default LimitType.DEFAULT;
}
