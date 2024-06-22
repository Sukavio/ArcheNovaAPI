package de.taichj.archeNovaAPI.monster.data

import de.taichj.archeNovaAPI.common.Attr
import de.taichj.archeNovaAPI.common.Typ
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Monster(@Id var id: Int, var name: String, var typ: Typ = Typ.Erde, var level: Int = 1,
                   var attr: Attr = Attr(),
                   var tags: Set<String> = setOf("Weiß"),
                   var talent: Talent = Talent("Kein Talent", "Dieses Monster hat kein Talent")
)