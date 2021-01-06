package com.example.spotifycloneapp.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.spotifycloneapp.R
import com.example.spotifycloneapp.ui.MainActivity
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        if(FirebaseAuth.getInstance().currentUser != null) {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }
}