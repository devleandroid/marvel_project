package com.example.marvel.project.model

import com.fasterxml.jackson.annotation.JsonProperty

class ComicsItem {
    private var resourceURI: String? = null
    private var name: String? = null

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
}