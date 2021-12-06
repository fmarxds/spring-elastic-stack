package br.com.fmarxds.springelasticstack.controller

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {

    companion object {
        @JvmStatic
        @Suppress("JAVA_CLASS_ON_COMPANION")
        private val logger = LoggerFactory.getLogger(javaClass.enclosingClass)
    }

    @GetMapping
    fun home(): ResponseEntity<Map<String, String>> {

        logger.info("Chegou uma nova requisição :)")
        val responseBody = mapOf(Pair("mensagem", "Olá, seja bem vindo!"))
        return ResponseEntity.ok(responseBody)

    }

}