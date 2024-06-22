package de.taichj.archeNovaAPI.attacke

import de.taichj.archeNovaAPI.attacke.data.Variante
import org.springframework.data.mongodb.repository.MongoRepository

interface VarianteRepository: MongoRepository<Variante, Int> {
}