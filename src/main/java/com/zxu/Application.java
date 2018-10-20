/*
 *
 * 项目名：	com.zxu
 * 文件名：	Application
 * 模块说明：
 * 修改历史：
 * 2018/4/27 - zhangxu - 创建。
 */

package com.zxu;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhangxu
 * @date 2018/4/27
 */
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.zxu.mapper")
@SpringBootApplication
@EnableCaching
public class Application extends SpringBootServletInitializer {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println(" ______                    _   ______            \n" +
                "|_   _ \\                  / |_|_   _ `.          \n" +
                "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
                "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\ \n" +
                " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
                "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    	LOG.info("我是MyEclipse");
        return builder.sources(Application.class);
    }
}
