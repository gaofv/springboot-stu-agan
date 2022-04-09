package org.springboot.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.config
 * @Description：
 * @Author：GF
 * @Date：2022/4/9 16:53
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "person", ignoreInvalidFields = false)
/**
 * ignoreUnknownFields：忽略未知的属性，默认为true。配置文件中的字段在bean中没有与之匹配的。此时是否忽略
 * ignoreInvalidFields：忽略无效的属性，默认为false，配置文件中的字段在bean中能匹配到，但是绑定失败，此时是否忽略
 */
public class PersonInfo {
    private Long id;
    private String userName;
    private Integer age;
    private Double salary;
    private Date bir;
    private Address address;
    private List<String> hobbies;
    private List<List<Integer>> list;
    private Map<String, String> detailAddress;
    private String addressName;

    @Data
    @ToString
    public static class Address {
        private String name;
        private String addressNo;
    }

}
