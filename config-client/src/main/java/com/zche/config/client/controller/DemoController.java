package com.zche.config.client.controller;

import com.zche.config.client.config.GitAutoRefreshConfig;
import com.zche.config.client.config.GitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 * Author：hezuchao
 * Date：2020/6/20 22:15
 */
@RefreshScope
@RestController
public class DemoController {
    @Autowired
    private GitConfig gitConfig;

    @Autowired
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    @GetMapping(value = "show")
    public Object show() {
        return gitConfig;
    }

    @GetMapping(value = "autoShow")
    public Object autoShow() {
        return gitAutoRefreshConfig;
    }
}
