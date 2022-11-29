package com.rookie.dagger2

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(private val userRepository:UserRepository,@MessageQualifier private val emailService:NotificationService) {

    fun registerUser(email:String, pass:String){
        userRepository.saveUser(email = "", pass = "")
        emailService.send("","","")
    }
}