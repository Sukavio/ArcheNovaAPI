package de.taichj.archeNovaAPI.monster

data class Monster(var name: String, var typ: Typ = Typ.Earth, var level: Int = 1, var hp: Int = 2, var atk: Int = 2, var mag: Int = 2, var def: Int = 2, var speed: Int = 2, var tags: Set<String> = setOf("Weiß"))
