package com.rookie.dagger2

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository:UserRepository, private val emailService:EmailService) {

    fun registerUser(email:String, pass:String){
        userRepository.saveUser(email = "", pass = "")
        emailService.send("","","")
    }
}