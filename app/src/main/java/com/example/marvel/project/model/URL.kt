package com.example.marvel.project.model

import com.fasterxml.jackson.annotation.JsonProperty

class URL {
    private var type: String? = null
    private var url: String? = null

    @JsonProperty("type")
    fun getType(): String? {
        return type
    }

    @JsonProperty("type")
    fun setType(value: String?) {
        type = value
    }

    @JsonProperty("url")
    fun getURL(): String? {
        return url
    }

    @JsonProperty("url")
    fun setURL(value: String?) {
        url = value
    }
}