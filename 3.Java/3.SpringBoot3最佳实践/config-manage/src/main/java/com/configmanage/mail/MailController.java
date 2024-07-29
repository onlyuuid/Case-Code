package com.configmanage.mail;

import com.configmanage.inject.MailProperties;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.Date;
@Slf4j
@RestController
@RequiredArgsConstructor
public class MailController {

    private final JavaMailSender javaMailSender;

    private final MailProperties mailProperties;

    @GetMapping("/sendEmail")
    @ResponseBody
    public boolean send(@RequestParam("email") String email, @RequestParam("text") String text) {
        try {
            MimeMessage msg = createMimeMessage(email, text, "java.png");
            javaMailSender.send(msg);
        } catch (Exception e) {
            log.error("发送失败:",e);
            return false;
        }
        return true;
    }

    /**
     * 创建复杂邮件
     * @param email
     * @param text
     * @param attachmentClassPath
     * @return
     */
    public MimeMessage createMimeMessage(String email,String text,String attachmentClassPath) throws MessagingException, UnsupportedEncodingException {
        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(msg, true);
        mimeMessageHelper.setFrom(mailProperties.getFrom(),mailProperties.getPersonal());
        mimeMessageHelper.setTo(email);
        mimeMessageHelper.setBcc(mailProperties.getBcc());
        mimeMessageHelper.setSubject(mailProperties.getSubject());
        mimeMessageHelper.setText(text);
        mimeMessageHelper.setSentDate(new Date());
        Integer tmp = attachmentClassPath.indexOf(".");
        String after = attachmentClassPath.substring(tmp);
        mimeMessageHelper.addAttachment("附件"+after,new ClassPathResource(attachmentClassPath));
        return msg;
    }



}
