package com.rookie.dagger2

import dagger.Component
import javax.inject.Inject

@Component
interface UserRegistrationComponent {
//    fun getUserRegistrationService():UserRegistrationService

//    fun getEmailService(): EmailService

    fun inject(mainActivity: MainActivity)
}