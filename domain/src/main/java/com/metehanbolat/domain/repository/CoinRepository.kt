package com.metehanbolat.domain.repository

import com.metehanbolat.domain.model.Coin
import com.metehanbolat.domain.model.CoinDetail

interface CoinRepository {

    suspend fun getCoins(): List<Coin>

    suspend fun getCoinById(coinId: String): CoinDetail
}