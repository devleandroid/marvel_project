package com.example.marvel.project.model

import com.fasterxml.jackson.annotation.JsonProperty

class ResultComics {
    private var id: String? = null
    private var name: String? = null
    private var description: String? = null
    private var modified: String? = null
    private var resourceURI: String? = null
    private var urls: List<URL?>? = null
    private var thumbnail: Thumbnail? = null
    private var comics: Comics? = null
    private var stories: Stories? = null
    private var events: Comics? = null
    private var series: Comics? = null

    @JsonProperty("id")
    fun getID(): String? {
        return id
    }

    @JsonProperty("id")
    fun setID(value: String?) {
        id = value
    }

    @JsonProperty("name")
    fun getName(): String? {
        return name
    }

    @JsonProperty("name")
    fun setName(value: String?) {
        name = value
    }

    @JsonProperty("description")
    fun getDescription(): String? {
        return description
    }

    @JsonProperty("description")
    fun setDescription(value: String?) {
        description = value
    }

    @JsonProperty("modified")
    fun getModified(): String? {
        return modified
    }

    @JsonProperty("modified")
    fun setModified(value: String?) {
        modified = value
    }

    @JsonProperty("resourceURI")
    fun getResourceURI(): String? {
        return resourceURI
    }

    @JsonProperty("resourceURI")
    fun setResourceURI(value: String?) {
        resourceURI = value
    }

    @JsonProperty("urls")
    fun getUrls(): List<URL?>? {
        return urls
    }

    @JsonProperty("urls")
    fun setUrls(value: List<URL?>?) {
        urls = value
    }

    @JsonProperty("thumbnail")
    fun getThumbnail(): Thumbnail? {
        return thumbnail
    }

    @JsonProperty("thumbnail")
    fun setThumbnail(value: Thumbnail?) {
        thumbnail = value
    }

    @JsonProperty("comics")
    fun getComics(): Comics? {
        return comics
    }

    @JsonProperty("comics")
    fun setComics(value: Comics?) {
        comics = value
    }

    @JsonProperty("stories")
    fun getStories(): Stories? {
        return stories
    }

    @JsonProperty("stories")
    fun setStories(value: Stories?) {
        stories = value
    }

    @JsonProperty("events")
    fun getEvents(): Comics? {
        return events
    }

    @JsonProperty("events")
    fun setEvents(value: Comics?) {
        events = value
    }

    @JsonProperty("series")
    fun getSeries(): Comics? {
        return series
    }

    @JsonProperty("series")
    fun setSeries(value: Comics?) {
        series = value
    }
}