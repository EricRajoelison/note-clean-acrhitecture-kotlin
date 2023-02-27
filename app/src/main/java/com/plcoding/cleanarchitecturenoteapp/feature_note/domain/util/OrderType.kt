package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

/**
 * Created by Eric Rajoelison on 24/02/2023.
 */
sealed class OrderType{

    object Ascending: OrderType()
    object Descending: OrderType()
}
