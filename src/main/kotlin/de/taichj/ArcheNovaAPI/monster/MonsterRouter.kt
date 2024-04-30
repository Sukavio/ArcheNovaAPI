package de.taichj.archeNovaAPI.monster

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RequestPredicates.accept
import org.springframework.web.reactive.function.server.RouterFunctions

@Configuration(proxyBeanMethods = false)
class MonsterRouter {
    @Bean
    fun route(monsterHandler: MonsterHandler) = RouterFunctions.route(GET("/monster")
        .and(accept(MediaType.APPLICATION_JSON)), monsterHandler::monster)
}