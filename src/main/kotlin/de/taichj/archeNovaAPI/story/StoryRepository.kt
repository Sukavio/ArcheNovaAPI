package de.taichj.archeNovaAPI.story

import de.taichj.archeNovaAPI.story.data.Story
import org.springframework.data.mongodb.repository.MongoRepository

interface StoryRepository: MongoRepository<Story, Int>