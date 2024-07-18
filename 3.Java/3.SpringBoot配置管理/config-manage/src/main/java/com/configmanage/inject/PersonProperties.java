package com.configmanage.inject;

import com.configmanage.domain.ConfigKey;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.List;
import java.util.Map;

/**
 * 使用setter方法绑定
 */
@Data
@ConfigurationProperties(prefix = "person")
public class PersonProperties {

    private List<String> name;

    private Integer age;

    private String email;

    private Map<String,Object> param;

    private ConfigKey configKey;
}

/**
 * 执行结果:
 * user: AddressProperties(name=[tom, jerry, mark], age=18, email=684723@qq.com,
 * param={cell-phone=16689562356, address=guizhou}, configKey=ConfigKey(privateKey=fjsalfjlasf,
 * publicKey=fjkasfkdahskfdjskdf))
 */

/**
 * 说明:
 * @ConfigurationProperties
 * 1.支持按配置参数的前缀进行绑定, 前缀一样的配置参数将被绑定到同一个类上
 * 2.支持配置参数使用默认值
 * 3.支持送绑定(xx1-xx2-xx3 -> xx1Xx2Xx3), 这里的连接符 - 也可以是下划线 _
 * 4.支持java集合绑定(如 List,Map)属性,
 * 5.支持嵌套类, 比如实例中自定义对象ConfigKey, 其所有字段值都能够正常绑定
 * 6.支持主要的配置途径, 比如.yml文件, .properties文件, 环境变量参数等
 * 7.需要搭配 @EnableConfigurationProperties注解共同使用
 */
