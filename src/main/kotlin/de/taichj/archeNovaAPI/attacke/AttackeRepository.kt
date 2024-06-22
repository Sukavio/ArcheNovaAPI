package de.taichj.archeNovaAPI.attacke

import de.taichj.archeNovaAPI.attacke.data.Attacke
import org.springframework.data.mongodb.repository.MongoRepository

interface AttackeRepository: MongoRepository<Attacke, Int> {
}