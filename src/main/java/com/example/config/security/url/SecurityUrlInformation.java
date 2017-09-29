package com.example.config.security.url;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix="security.url")
public class SecurityUrlInformation {

	private String login;

	private String logout;

	private String mypage;

}
