package de.taichj.archeNovaAPI.story.data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Story(@Id var id: Int, var bezeichnung: String, var tag: Int)
