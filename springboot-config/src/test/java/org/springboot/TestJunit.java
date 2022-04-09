package org.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot
 * @Description：
 * @Author：GF
 * @Date：2022/4/9 15:26
 */
public class TestJunit {
    @Test
    public void testReadYaml() {
        Object object;
        Yaml yaml = new Yaml();
        // yaml文件路径
        InputStream in = TestJunit.class.getClassLoader().getResourceAsStream("application.yml");
        Assert.notNull(in,"未获取到流");
        object = yaml.loadAs(in, Map.class);

        System.out.println(object.toString());
    }
}
