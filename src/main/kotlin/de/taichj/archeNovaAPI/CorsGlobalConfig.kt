package de.taichj.archeNovaAPI

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.reactive.CorsWebFilter
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource

@Configuration
class CorsGlobalConfig {
    @Bean
    fun corsFilter(): CorsWebFilter {
        val config = CorsConfiguration()
        config.allowedOrigins = listOf("http://localhost:5174") // Angular Entwicklungsserver
        config.allowedMethods = listOf("*")
        config.allowedHeaders = listOf("*")
        config.allowCredentials = true

        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", config)

        return CorsWebFilter(source)
    }
}