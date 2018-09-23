package com.example.gradleprofile.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

/**
 * This config class holds one property.
 * @property [profileName] : holds the value from properties file.
 *
 * @author Chandrika Rao C on 23/09/18
 */

@Configuration
@ConfigurationProperties(prefix = "application.config")
class ApplicationConfig {

    lateinit var profileName: String
}