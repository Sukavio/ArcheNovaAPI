package de.taichj.archeNovaAPI.monster.data

import de.taichj.archeNovaAPI.common.Attr
import de.taichj.archeNovaAPI.common.Typ
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.Size
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Monster(
    @field:Size(min = 1, max = 255, message = "Name must be between 1 and 255")
    var name: String,
    var typ: Typ = Typ.Erde,
    @field:Min(value = 1, message = "Level muss größer sein als 1.")
    @field:Max(value = 14, message = "Level darf nicht größer als 14 sein.")
    var stufe: Int = 1,
    @field:Size(min = 1, max = 255, message = "Name must be between 1 and 255")
    var image: String = "",
    var attr: Attr = Attr(),
    @field:Size(min = 1, message = "List must be between 1 and 255")
    var tags: Set<String> = setOf("Weiß"),
    var talent: Talent = Talent(
        "Kein Talent",
        "Dieses Monster hat kein Talent"
    ),
    @Id var id: String = name.uppercase().trim().replace(" ", ""),
)