package com.kith.timefighter

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kith.timefighter.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    lateinit var welcomeBinding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        welcomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)
        setContentView(welcomeBinding.root)

        welcomeBinding.continueButton.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
            overridePendingTransition(R.anim.right_to_left2, R.anim.stay_put)
            finish()
        }
    }
}