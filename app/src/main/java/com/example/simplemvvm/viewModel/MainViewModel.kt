package com.example.simplemvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simplemvvm.model.Repository
import com.example.simplemvvm.model.User

class MainViewModel :ViewModel(){
    private var _user= MutableLiveData<User>()
    val user: LiveData<User>
    get() = _user

    fun getUserInfo(){
        _user.postValue(Repository.getUser())
    }



//    fun showData(){
//        _user.postValue(User("from button"))
//    }

}