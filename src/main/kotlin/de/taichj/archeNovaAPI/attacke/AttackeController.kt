package de.taichj.archeNovaAPI.attacke

import de.taichj.archeNovaAPI.attacke.data.Attacke
import de.taichj.archeNovaAPI.attacke.data.Variante
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/", produces = ["application/json"], consumes = ["application/json"])
class AttackeController {
    @Autowired lateinit var attackeRepository: AttackeRepository
    @Autowired lateinit var varianteRepository: VarianteRepository

    @GetMapping("/attacke")
    fun getAttacke(): MutableList<Attacke> = attackeRepository.findAll()
    @GetMapping("/variante")
    fun getVariante(): MutableList<Variante> = varianteRepository.findAll()

    @GetMapping("/attacke/{id}")
    fun getAttackeById(@PathVariable(value = "id") id: Int) = attackeRepository.findById(id)
    @GetMapping("/variante/{id}")
    fun getVarianteById(@PathVariable(value = "id") id: Int) = varianteRepository.findById(id)

    @PostMapping("/attacke")
    @PutMapping("/attacke")
    fun updateAttacke(@RequestBody attacke: Attacke) = attackeRepository.save(attacke)
    @PostMapping("/variante")
    @PutMapping("/variante")
    fun updateVariante(@RequestBody variante: Variante) = varianteRepository.save(variante)

    @DeleteMapping("/attacke/{id}")
    fun deleteAttacke(@PathVariable(value = "id") id: Int) = attackeRepository.deleteById(id)
    @DeleteMapping("/variante/{id}")
    fun deleteVariante(@PathVariable(value = "id") id: Int) = varianteRepository.deleteById(id)
}