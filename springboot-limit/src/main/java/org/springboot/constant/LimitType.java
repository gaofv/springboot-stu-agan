package org.springboot.constant;

/**
 * @ProjectName：springboot-stu-agan
 * @Package：org.springboot.constant
 * @Description：限流策略枚举
 * @Author：gaofei32419
 * @Date：2022/5/17 13:01
 */
public enum LimitType {
    /**
     * 默认全局限流策略
     */
    DEFAULT,
    /**
     * 根据IP限流策略
     */
    IP
}
