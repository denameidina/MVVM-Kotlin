package com.nafanesia.mvvm.data.repositories

import com.nafanesia.mvvm.data.network.MyApi
import com.nafanesia.mvvm.data.network.SafeApiRequest
import com.nafanesia.mvvm.data.network.responses.AuthResponse

class UserRepository : SafeApiRequest() {
    suspend fun userLogin(email: String, password: String): AuthResponse {
        return apiRequest { MyApi().userLogin(email, password) }
    }
}