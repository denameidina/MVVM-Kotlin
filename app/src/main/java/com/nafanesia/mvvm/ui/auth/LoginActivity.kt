package com.nafanesia.mvvm.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nafanesia.mvvm.R
import com.nafanesia.mvvm.data.db.entities.User
import com.nafanesia.mvvm.databinding.ActivityLoginBinding
import com.nafanesia.mvvm.util.hide
import com.nafanesia.mvvm.util.show
import com.nafanesia.mvvm.util.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.authListener = this

    }

    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSuccess(user : User) {
        progress_bar.hide()
        toast("${user.name} is Logged in")
    }

    override fun onFailure(message: String) {
        toast(message)
        progress_bar.hide()
    }

}
