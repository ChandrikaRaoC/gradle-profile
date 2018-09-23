package com.example.gradleprofile.service.impl

import com.example.gradleprofile.configuration.ApplicationConfig
import com.example.gradleprofile.service.BaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * This is the implementation class for base controller.
 * @author Chandrika Rao C on 23/09/18
 */

@Service

class BaseServiceImpl : BaseService {

    @Autowired
    lateinit var applicationConfig: ApplicationConfig

    /**
     * [getWelcomeMessage] is a get method.
     * @return [String]
     *
     * Uses application config property.
     */
    @Throws(Exception::class)
    override fun getWelcomeMessage(): String {

        try {

            return "<center><h1>Welcome to gradle profile!!</h1><br /><pr>Running in <b>${applicationConfig.profileName}</b>.</pr></center>"

        } catch (e: Exception) {
            throw e
        }
    }
}