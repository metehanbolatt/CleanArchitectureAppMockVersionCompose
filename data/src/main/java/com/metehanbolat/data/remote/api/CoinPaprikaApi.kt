package com.metehanbolat.data.remote.api

import com.metehanbolat.data.remote.model.CoinDetailModel
import com.metehanbolat.data.remote.model.CoinModel
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinModel>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailModel

}