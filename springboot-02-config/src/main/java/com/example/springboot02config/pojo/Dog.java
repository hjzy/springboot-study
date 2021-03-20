package com.example.springboot02config.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yifansun
 * @version 1.0
 * @Description
 * @date 2021/3/20 15:59
 * @email yifan@yifansun.cn
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Dog {
    @Value("阿黄")
    private String name;
    @Value("18")
    private Integer age;
}
