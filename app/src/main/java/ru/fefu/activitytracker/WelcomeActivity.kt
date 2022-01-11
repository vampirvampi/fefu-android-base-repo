package ru.fefu.activitytracker

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.View
import ru.fefu.activitytracker.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.registrationButton.setOnClickListener{
            startActivity(Intent(this,RegistrationActivity::class.java))
            this.finish()
        }
        binding.loginButton.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
            this.finish()
        }

    }
}
