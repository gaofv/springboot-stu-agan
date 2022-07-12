package org.springboot.exception;

/**
 * @ProjectName：springboot-stu-agan
 * @Package：org.springboot.exception
 * @Description：
 * @Author：gaofei32419
 * @Date：2022/5/17 13:24
 */
public class ServiceException extends RuntimeException{

    public ServiceException(String message) {
        super(message);
    }
}
