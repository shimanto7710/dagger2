package com.rookie.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    private val userRepository=UserRepository()
//    private val emailService=EmailService()

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userRegistrationService=UserRegistrationService(userRepository, emailService)
        val component=DaggerUserRegistrationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()
        component.inject(this)
        userRegistrationService.registerUser("","")
    }
}