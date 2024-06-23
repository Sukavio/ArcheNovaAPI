package de.taichj.archeNovaAPI.monster

import de.taichj.archeNovaAPI.monster.data.Monster
import org.springframework.data.mongodb.repository.MongoRepository

interface MonsterRepository: MongoRepository<Monster, String> {
    fun findByStufe(stufe: Int): MutableList<Monster>
    fun findByTagsContaining(tag: String): MutableList<Monster>
}