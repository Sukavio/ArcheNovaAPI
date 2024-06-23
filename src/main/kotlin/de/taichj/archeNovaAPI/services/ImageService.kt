package de.taichj.archeNovaAPI.services

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.core.io.Resource
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.springframework.core.io.support.ResourcePatternResolver
import org.springframework.stereotype.Service
import java.io.IOException

@Service
class RandomImageService {

    @Value("\${image.directory:classpath:/static/}")
    private lateinit var imageDirectory: String

    fun getImageNames(): List<String> {
        return try {
            val resourcePatternResolver = PathMatchingResourcePatternResolver()
            val resources: Array<Resource> = resourcePatternResolver.getResources("$imageDirectory*.png")
            resources.map { it.filename!! }
        } catch (ex: IOException) {
            println("Fehler beim Laden der Bildnamen: ${ex.message}")
            emptyList()
        }
    }
}