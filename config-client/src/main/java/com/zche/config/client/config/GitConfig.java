package com.zche.config.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description：
 * Author：hezuchao
 * Date：2020/6/21 17:13
 */
@Data
@Component
public class GitConfig {

    @Value("${data.env}")
    private String env;

    @Value("${data.user.username}")
    private String username;

    @Value("${data.user.password}")
    private String password;

}
