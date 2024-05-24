package de.taichj.archeNovaAPI.monster

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class MonsterHandler {
    fun monster(request: ServerRequest) = ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(BodyInserters.fromValue(Monster("Test")))

    fun addMonster(serverRequest: ServerRequest): Mono<ServerResponse> = serverRequest.bodyToMono(Monster::class.java)
        .flatMap { monster ->
            println("Was geht")
            println(monster)
            ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(Monster("Test")))
        }
}