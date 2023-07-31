package com.example.infoseries.Utils


class Const private constructor() {
    object Const {
        const val BASE_URL = "https://api.tvmaze.com/"
        const val SHOWS = "show"
        const val SHOW = "show/{id}"
        const val EPISODES = "/shows/{id}/episodes"
        const val SEASON = "shows/{id}/seasons"
        const val EPISODE = "shows/{id}/episodebynumber"
        const val SHOWS_SEARCH = "search/shows"
    }


    object CLIENT {
        const val TOKEN = "access-token"
        const val CLIENT = "client"
        const val UID = "uid"
    }
}
