package com.nafanesia.mvvm.data.network.responses

import com.nafanesia.mvvm.data.db.entities.User

data class AuthResponse (
    val isSuccsessful : Boolean?,
    val message : String?,
    val user : User?
)