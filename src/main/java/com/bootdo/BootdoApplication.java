package com.bootdo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/*
    事物管理器开启
 */
@EnableTransactionManagement
/**
 * 老子可以web
 */
@ServletComponentScan
@MapperScan("com.bootdo.*.dao")
/**
 * 老子是个 springboot项目
 *
 */
@SpringBootApplication
public class BootdoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootdoApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    bootdo启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
                " ______                    _   ______            \n" +
                "|_   _ \\                  / |_|_   _ `.          \n" +
                "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
                "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\ \n" +
                " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
                "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  "+"\n"+"\n"+"\n");





        String fozu =
                "                   _ooOoo_"+"\n"+
                        "                  o8888888o"+"\n"+
                        "                  88\" . \"88"+"\n"+
                        "                  (| -_- |)"+"\n"+
                        "                  O\\  =  /O"+"\n"+
                        "               ____/`---'\\____"+"\n"+
                        "             .'  \\\\|     |//  `."+"\n"+
                        "            /  \\\\|||  :  |||//  \\"+"\n"+
                        "           /  _||||| -:- |||||-  \\"+"\n"+
                        "           |   | \\\\\\  -  /// |   |"+"\n"+
                        "           | \\_|  ''\\---/''  |   |"+"\n"+
                        "           \\  .-\\__  `-`  ___/-. /"+"\n"+
                        "         ___`. .'  /--.--\\  `. . __"+"\n"+
                        "      .\"\" '<  `.___\\_<|>_/___.'  >'\"\"."+"\n"+
                        "     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |"+"\n"+
                        "     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /"+"\n"+
                        "======`-.____`-.___\\_____/___.-`____.-'======"+"\n"+
                        "                   `=---='"+"\n"+
                        "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+"\n"+
                        "                 佛祖保佑       永无BUG";
        System.out.println(fozu);
    }
}
