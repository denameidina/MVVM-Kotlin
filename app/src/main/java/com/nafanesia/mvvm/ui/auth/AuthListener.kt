package com.nafanesia.mvvm.ui.auth

import com.nafanesia.mvvm.data.db.entities.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user : User)
    fun onFailure(message : String)
}