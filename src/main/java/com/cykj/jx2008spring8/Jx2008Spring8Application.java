package com.cykj.jx2008spring8;
//标注说明这个类是SPRINGbOOT的主配置类
//全局配置文件application.properties/application.yml名称是固定的
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//配置dao层接口路径
@MapperScan(basePackages = "com.cykj.jx2008spring8.mapper")
//ComponentScan用于类或接口上主页是指定的扫描路径。spring 会把指定路径下带有注解的类进行自动配置
//效果类似于  《context:component-scan base-package="com.cykj"》配置
@ComponentScan({"com.cykj.jx2008spring8.controller","com.cykj.jx2008spring8.service"})
public class Jx2008Spring8Application {
    //项目运行就用主配置类中的mai'n方法运行
    public static void main(String[] args) {
        SpringApplication.run(Jx2008Spring8Application.class, args);
    }

}
