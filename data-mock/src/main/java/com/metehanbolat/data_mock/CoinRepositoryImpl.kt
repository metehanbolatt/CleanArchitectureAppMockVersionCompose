package com.metehanbolat.data_mock

import com.metehanbolat.domain.model.Coin
import com.metehanbolat.domain.model.CoinDetail
import com.metehanbolat.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(

): CoinRepository {

    val a = arrayListOf(
        Coin("1", false, "Bitcoin", 14, "BTC"),
        Coin("2", true, "DogeCoin", 12, "DGC"))

    override suspend fun getCoins(): List<Coin> {
        return a
    }

    override suspend fun getCoinById(coinId: String): CoinDetail {
        return CoinDetail("1", "BTC","BTTC","btc",12, true, emptyList(), emptyList())
    }

}