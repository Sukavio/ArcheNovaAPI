package de.taichj.archeNovaAPI.attacke.data

import de.taichj.archeNovaAPI.common.Status
import de.taichj.archeNovaAPI.common.Tag
import de.taichj.archeNovaAPI.common.WuerfelSymbol

data class Bedingung(var name: String, var anzahl: Int, var wuerfelSymbol: WuerfelSymbol = WuerfelSymbol.Status,
                     var status: List<Status> = listOf(), var tag: List<Tag> = listOf())
