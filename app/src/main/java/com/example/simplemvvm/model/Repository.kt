package com.example.simplemvvm.model

object Repository {
    val data =FakeData()

    fun getUser() =
        data.getRandomUser()

}