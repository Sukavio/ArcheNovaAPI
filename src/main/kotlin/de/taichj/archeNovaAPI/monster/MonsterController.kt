package de.taichj.archeNovaAPI.monster

import de.taichj.archeNovaAPI.monster.data.Monster
import de.taichj.archeNovaAPI.services.RandomImageService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/monster", produces = [MediaType.APPLICATION_JSON_VALUE], consumes = [MediaType.APPLICATION_JSON_VALUE])
@Validated
class MonsterController(
    private val randomImageService: RandomImageService,
    private var repo: MonsterRepository) {

    @GetMapping
    fun getAll(): MutableList<Monster> = repo.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): Monster = repo.findById(id).orElse(null)

    @GetMapping("/byLevel/{stufe}")
    fun getByLevel(@PathVariable stufe: Int): MutableList<Monster> = repo.findByStufe(stufe)

    @GetMapping("/byTag/{tag}")
    fun getByTag(@PathVariable tag: String): MutableList<Monster> = repo.findByTagsContaining(tag)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    fun update(@Valid @RequestBody monster: Monster) = repo.save(monster)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: String) = repo.deleteById(id)

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteAll() = repo.deleteAll()

    @GetMapping("/random-image")
    fun getRandomImage(): String? {
        return randomImageService.getImageNames().random()
    }
}