package com.katleo.book.email;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "application.mailing")
@Data
public class ApplicationMailProperties {

    private  Frontend frontend = new Frontend();

    @Data
    public static class Frontend{
        private String activationUrl;
    }

}
