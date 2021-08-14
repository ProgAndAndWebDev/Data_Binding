package com.example.simplemvvm.model

class FakeData {
    private val users= mutableListOf<User>().apply {
        (1..6).forEach {
            this.add(User("user number $it"))
        }

    }

    fun getRandomUser()=
        users.random()
}