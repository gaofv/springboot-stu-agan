package org.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName：springboot-stu
 * @PackageName：org.springboot.config
 * @Description：
 * @Author：GF
 * @Date：2022/4/9 14:42
 */
@ConfigurationProperties(prefix = "spring.datasource")
@Component
public class DataSourceProps {

    private String url;
    private String driverClassName;
    private String userName;
    private String password;


    @Override
    public String toString() {
        return "DataSourceProps{" +
                "url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
