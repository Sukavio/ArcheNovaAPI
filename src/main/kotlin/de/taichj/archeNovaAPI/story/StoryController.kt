package de.taichj.archeNovaAPI.story

import de.taichj.archeNovaAPI.story.data.Story
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/story", produces = ["application/json"], consumes = ["application/json"])
class StoryController {

    @Autowired
    lateinit var repo: StoryRepository

    @GetMapping("/all")
    fun all(): MutableList<Story> = repo.findAll()

    @GetMapping("/")
    fun random() {

    }

    @PutMapping
    @PostMapping
    fun update(@RequestBody story: Story) = repo.save(story)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) = repo.deleteById(id)

    @PostMapping("/init")
    fun initialisiere(): ResponseEntity<Unit> {
        repo.save(Story(1, "Erste Story", 1))
        repo.save(Story(2, "Zweite Story", 2))
        repo.save(Story(3, "Dritte Story", 3))
        repo.save(Story(4, "Vierte Story", 4))
        return ResponseEntity.ok().build()
    }
}