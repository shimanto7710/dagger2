package com.rookie.dagger2

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(email: String, from:String, body: String)
}

class EmailService @Inject constructor() : NotificationService{
    override fun send(email:String, from:String, body:String){
        Log.d("","email sent")
    }
}


class MessageService @Inject constructor(private val retryCount:Int) : NotificationService{
    override fun send(email:String, from:String, body:String){
        Log.d("","msg sent")
    }
}