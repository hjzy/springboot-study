package com.example.springboot02config.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author yifansun
 * @version 1.0
 * @Description
 * @date 2021/3/20 16:00
 * @email yifan@yifansun.cn
 */
/*
@ConfigurationProperties作用：
将配置文件中配置的每一个属性的值，映射到这个组件中；
告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
参数 prefix = “person” : 将配置文件中的person下面的所有属性一一对应
*/
//这个注解对应的配置文件是application.yml
@ConfigurationProperties(prefix = "person2")
@Component //注册bean到容器中
@Data
@AllArgsConstructor
@NoArgsConstructor
//校验
@Validated
//加载指定的配置文件
//@PropertySource(value = "classpath:person.properties")
public class Person {
    //使用@Value注解取出person.properties的name值
    //@Value("$name")
    private String name;
    //指定该参数为邮箱格式，否则输出错误信息
    @Email(message = "邮箱格式错误")
    private String email;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;


    //有参无参构造、get、set方法、toString()方法

}