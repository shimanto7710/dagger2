package com.rookie.dagger2

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, pass: String)
}

class SQLRepository @Inject constructor() :UserRepository{
    override fun saveUser(email:String, pass:String){
        Log.d("","User Saved in DB")
    }
}

class FirebaseRepository @Inject constructor() :UserRepository{
    override fun saveUser(email:String, pass:String){
        Log.d("","User Saved in Firebase")
    }
}