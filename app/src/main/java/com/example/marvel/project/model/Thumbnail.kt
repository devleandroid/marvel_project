package com.example.marvel.project.model

import com.fasterxml.jackson.annotation.JsonProperty

class Thumbnail {
    private var path: String? = null
    private var extension: String? = null

    @JsonProperty("path")
    fun getPath(): String? {
        return path
    }

    @JsonProperty("path")
    fun setPath(value: String?) {
        path = value
    }

    @JsonProperty("extension")
    fun getExtension(): String? {
        return extension
    }

    @JsonProperty("extension")
    fun setExtension(value: String?) {
        this.extension = value
    }
}