package com.example.infoseries.retrofit

import android.content.Context
import com.example.infoseries.Utils.Const
import com.example.infoseries.presenters.interfaces.Service
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Client {


    private lateinit var INSTANCE: Retrofit

    private val token: String = ""
    private val client: String = ""
    private val uid: String = ""
    fun getRetrofitInstance(): Retrofit {
        val httpClient = OkHttpClient.Builder()

        httpClient.addInterceptor { chain ->
            val request = chain.request()
                .newBuilder()
                .addHeader(Const.CLIENT.TOKEN, token)
                .addHeader(Const.CLIENT.CLIENT, client)
                .addHeader(Const.CLIENT.UID, uid)
                .build()
            chain.proceed(request)
        }

        if(!::INSTANCE.isInitialized){
            synchronized(Client::class.java){
                INSTANCE = Retrofit.Builder()
                    .baseUrl(Const.Const.BASE_URL)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
        }

        return INSTANCE
    }


}
