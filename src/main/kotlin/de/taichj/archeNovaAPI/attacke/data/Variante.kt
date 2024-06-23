package de.taichj.archeNovaAPI.attacke.data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Variante(var name: String, @Id var id: String = name.uppercase().trim().replace(" ", ""),
                    var bezeichnung: String = "Noch nicht befüllt.",
                    var bedingung: List<Bedingung> = listOf())
