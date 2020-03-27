package com.example.marvel.project.model

import com.fasterxml.jackson.annotation.JsonProperty

class Stories {
    private var available: String? = null
    private var returned: String? = null
    private var collectionURI: String? = null
    private var items: List<StoriesItem?>? = null

    @JsonProperty("available")
    fun getAvailable(): String? {
        return available
    }

    @JsonProperty("available")
    fun setAvailable(value: String?) {
        available = value
    }

    @JsonProperty("returned")
    fun getReturned(): String? {
        return returned
    }

    @JsonProperty("returned")
    fun setReturned(value: String?) {
        returned = value
    }

    @JsonProperty("collectionURI")
    fun getCollectionURI(): String? {
        return collectionURI
    }

    @JsonProperty("collectionURI")
    fun setCollectionURI(value: String?) {
        collectionURI = value
    }

    @JsonProperty("items")
    fun getItems(): List<StoriesItem?>? {
        return items
    }

    @JsonProperty("items")
    fun setItems(value: List<StoriesItem?>?) {
        items = value
    }

}