package dev.kanini.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.kanini.workoutlog.databinding.ActivityLoginBinding
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity() {
  lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvsignup.setOnClickListener{
            val intent = Intent(this,SignUpActivity::class.java)
        }
        binding.btnLogin.setOnClickListener{
                validateLogin()
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
    }
    fun validateLogin(){
        val Email=binding.etEmail.text.toString()
        val Password=binding.etPassword.text.toString()
        if (Email.isBlank()){
            binding.tilEmail.error="invalid"
        }
        if (Password.isBlank()){
            binding.tilPassword.error="invalid"
        }
        if (Email.isBlank())
            binding.tilEmail.error="Invalid"
        if (!Patterns.EMAIL_ADDRESS.matcher(Email).matches()){
            binding.tilEmail.error="Email is invalid"
        }
    }
}