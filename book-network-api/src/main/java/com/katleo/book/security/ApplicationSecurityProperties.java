package com.katleo.book.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "application.security")
@Data
public class ApplicationSecurityProperties {

    private final Cors cors = new Cors();
    private final Jwt jwt = new Jwt();

    @Data
    public static class Cors{
        private List<String> allowedOrigins;
    }
    @Data
    public static class Jwt{
        private Long jwtExpiration;
        private String secretKey;
    }
}
