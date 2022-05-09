package org.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.entity
 * @Description：
 * @Author：GF
 * @Date：2022/5/5 21:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApplicationInfo {
    /**
     * 应用key
     */
    private String appKey;
    /**
     * 应用名称
     */
    private String appName;
    /**
     * 应用描述信息
     */
    private String appDescription;
    /**
     * 应用编号
     */
    private Integer appNum;
}
