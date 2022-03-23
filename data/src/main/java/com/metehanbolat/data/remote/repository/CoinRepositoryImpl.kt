package com.metehanbolat.data.remote.repository

import com.metehanbolat.data.remote.api.CoinPaprikaApi
import com.metehanbolat.data.remote.extensions.toCoin
import com.metehanbolat.data.remote.extensions.toCoinDetail
import com.metehanbolat.data.remote.model.CoinDetailModel
import com.metehanbolat.data.remote.model.CoinModel
import com.metehanbolat.domain.model.Coin
import com.metehanbolat.domain.model.CoinDetail
import com.metehanbolat.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }

    override suspend fun getCoinById(coinId: String): CoinDetail {
        return api.getCoinById(coinId).toCoinDetail()
    }

}