package com.metehanbolat.data.remote.extensions

import com.metehanbolat.domain.model.Coin
import com.metehanbolat.domain.model.CoinDetail
import com.metehanbolat.data.remote.model.CoinDetailModel
import com.metehanbolat.data.remote.model.CoinModel

fun CoinDetailModel.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags.map { it.name },
        team = team
    )
}

fun CoinModel.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}