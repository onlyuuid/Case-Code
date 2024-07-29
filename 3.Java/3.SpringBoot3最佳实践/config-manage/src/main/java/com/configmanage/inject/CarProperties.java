package com.configmanage.inject;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Data
@Validated    // 开启参数校验
@ConfigurationProperties(prefix = "car")
public class CarProperties {

    @NotNull  // 添加参数校验
    private String name;

    private Integer age;

    @NotNull
    private String color;

    /**
     *
     Binding to target com.configmanage.inject.CarProperties failed:

     Property: car.color
     Value: "null"
     Reason: 不能为null


     Action:

     Update your application's configuration
     */

}
