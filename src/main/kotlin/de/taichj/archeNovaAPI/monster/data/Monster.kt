package de.taichj.archeNovaAPI.monster.data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Monster(@Id var id: Int, var name: String, var typ: Typ = Typ.Erde, var level: Int = 1, var hp: Int = 2, var atk: Int = 2,
                   var mag: Int = 2, var def: Int = 2, var speed: Int = 2, var tags: Set<String> = setOf("Weiß"),
                   var talent: Talent = Talent("Kein Talent", "Dieses Monster hat kein Talent")
)