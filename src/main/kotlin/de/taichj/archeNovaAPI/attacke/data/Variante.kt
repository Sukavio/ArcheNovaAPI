package de.taichj.archeNovaAPI.attacke.data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Variante(@Id var id: Int, var name: String, var bezeichnung: String = "Noch nicht befüllt.",
                    var bedingung: List<Bedingung> = listOf())
