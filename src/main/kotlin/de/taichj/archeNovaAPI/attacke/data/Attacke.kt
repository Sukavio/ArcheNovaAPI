package de.taichj.archeNovaAPI.attacke.data

import de.taichj.archeNovaAPI.common.Attribute
import de.taichj.archeNovaAPI.common.Typ
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Attacke(var name: String, @Id var id: String = name.uppercase().trim().replace(" ", ""),
                   var typ: Typ = Typ.Feuer, var power: Int = 1, var basis: Attribute = Attribute.ang,
                   var bezeichnung: String = "Noch nicht befüllt.", var bedingung: List<Bedingung> = listOf())