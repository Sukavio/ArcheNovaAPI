package de.taichj.archeNovaAPI.attacke.data

import de.taichj.archeNovaAPI.common.Attribute
import de.taichj.archeNovaAPI.common.Typ
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Attacke(@Id var id: Int, var name: String, var typ: Typ = Typ.Feuer, var power: Int = 1, var basis: Attribute = Attribute.ang,
                   var bezeichnung: String = "Noch nicht befüllt.", var bedingung: List<Bedingung> = listOf())