package com.example.gradleprofile.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.example.gradleprofile.service.BaseService

/**
 *
 * This class deals with base service, it is an example which shows how to use application config properties.
 * @author Chandrika Rao C on 23/09/18
 */

@RestController
class BaseController {

    @Autowired
    lateinit var baseService: BaseService

    @RequestMapping(value = ["/"])
    fun basePath(): String {

        return try {
            baseService.getWelcomeMessage()
        } catch (e: Exception) {
            "Something went wrong!! Please try again later"
        }
    }
}