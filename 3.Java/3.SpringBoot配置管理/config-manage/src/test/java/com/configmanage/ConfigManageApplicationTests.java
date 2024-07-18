package com.configmanage;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
class ConfigManageApplicationTests {

    @Autowired
    private StringEncryptor encryptor;

    @Test
    void contextLoads() {

        // 方式一: 使用测试类加密
        String adminEnc = encryptor.encrypt("admin");
        String pwdEnc = encryptor.encrypt("123456");
        log.info("adminEnc:{}", adminEnc);
        log.info("pwdEnc:{}", pwdEnc);

        log.info("admin:{}", encryptor.decrypt(adminEnc));
        log.info("pwd:{}", encryptor.decrypt(pwdEnc));

        /**
         * 方式二: 使用mvn命令行加密
         *        mvn jasypt:encrypt-value -D jasypt.encryptor.password="fkjHKJHKfs435jhfkjdahfaksldfhkajfhjs" -D jasypt.plugin.value="admin"
         *        mvn jasypt:encrypt-value -D jasypt.encryptor.password="fkjHKJHKfs435jhfkjdahfaksldfhkajfhjs" -D jasypt.plugin.value="123456"
         *  注意这种方式需要引入插件:
         *
         *    mvn命令行加/解密插件
         *     <plugin>
         *          <groupId>com.github.ulisesbocchio</groupId>
         *          <artifactId>jasypt-maven-plugin</artifactId>
         *          <version>3.0.5</version>
         *     </plugin>
         *
         */


    }

}
