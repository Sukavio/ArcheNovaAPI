package de.taichj.archeNovaAPI.monster

import de.taichj.archeNovaAPI.monster.data.Monster
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/monster", produces = ["application/json"], consumes = ["application/json"])
class MonsterController {

    @Autowired
    lateinit var repo: MonsterRepository

    @GetMapping("/find")
    fun find() = Monster(1, "test")

    @GetMapping
    fun getAll(): MutableList<Monster> = repo.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): Monster = repo.findById(id).orElse(null)

    @GetMapping("/byLevel/{level}")
    fun getByLevel(@PathVariable level: Int): MutableList<Monster> = repo.findByLevel(level)

    @GetMapping("/byTag/{tag}")
    fun getByTag(@PathVariable tag: String): MutableList<Monster> = repo.findByTagsContaining(tag)

    @PostMapping
    @PutMapping
    fun update(@RequestBody monster: Monster) = repo.save(monster)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) = repo.deleteById(id)
}