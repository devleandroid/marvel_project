package com.example.marvel.project.model

import com.fasterxml.jackson.annotation.JsonProperty

class StoriesItem {
    private var resourceURI: String? = null
    private var name: String? = null
    private var type: String? = null

    @JsonProperty("resourceURI")
    fun getResourceURI(): String? {
        return resourceURI
    }

    @JsonProperty("resourceURI")
    fun setResourceURI(value: String?) {
        resourceURI = value
    }

    @JsonProperty("name")
    fun getName(): String? {
        return name
    }

    @JsonProperty("name")
    fun setName(value: String?) {
        name = value
    }

    @JsonProperty("type")
    fun getType(): String? {
        return type
    }

    @JsonProperty("type")
    fun setType(value: String?) {
        type = value
    }
}