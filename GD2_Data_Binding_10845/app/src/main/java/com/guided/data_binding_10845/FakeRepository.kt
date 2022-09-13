package com.guided.data_binding_10845

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random


object FakeRepository {
    private val friutNames: List<String> = listOf(
        "Apel","Mangga","Pisang","Anggur","Stroberi",
        "Jambu","Raspberi","Bambu","Kiwi","Pirl"
    )

    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value = friutNames.first()
    }

    fun getRandomfruitName(): String {
        val random = Random.nextInt(friutNames.size)
        return friutNames[random]
    }

    fun changeCurrentRandomFruitName() {
        _currentRandomFruitName.value = getRandomfruitName()
    }
}