package com.example.infoseries.presenters.interfaces

import com.example.infoseries.Utils.Const
import com.example.infoseries.domain.model.Episode
import com.example.infoseries.domain.model.Season
import com.example.infoseries.domain.model.SerieModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Service {

    @GET(Const.SHOWS)
    fun getShows(@Query("page") page: Int): Call<List<SerieModel>>

    @GET(Const.SHOW)
    fun getShow(@Path("id") id: Long): Call<SerieModel>

    @GET(Const.EPISODES)
    fun getEpisodes(@Path("id") id: Long): Call<List<Episode>>

    @GET(Const.EPISODE)
    fun getEpisode(
        @Path("id") id: Long,
        @Query("season") season: Long,
        @Query("number") number: Long
    ): Call<Episode>

    @GET(Const.SEASON)
    fun getSeason(@Path("id") id: Long): Call<List<Season>>

}