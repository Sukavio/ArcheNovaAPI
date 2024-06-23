package de.taichj.archeNovaAPI.common

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min

data class Attr(
    @field:Min(value = 1, message = "HP muss größer sein als 0.")
    @field:Max(value = 17, message = "HP darf nicht größer als 17 sein.")
    var hp: Int = 1,
    @field:Min(value = 1, message = "ANG muss größer sein als 0.")
    @field:Max(value = 17, message = "ANG darf nicht größer als 17 sein.")
    var ang: Int = 1,
    @field:Min(value = 1, message = "MAG muss größer sein als 0.")
    @field:Max(value = 17, message = "MAG darf nicht größer als 17 sein.")
    var mag: Int = 1,
    @field:Min(value = 1, message = "DEF muss größer sein als 0.")
    @field:Max(value = 17, message = "DEF darf nicht größer als 17 sein.")
    var def: Int = 1,
    @field:Min(value = 1, message = "SPEED muss größer sein als 0.")
    @field:Max(value = 17, message = "SPEED darf nicht größer als 17 sein.")
    var speed: Int = 1)
