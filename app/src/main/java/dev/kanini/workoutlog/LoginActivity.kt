package dev.kanini.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tvsignup:TextView
    lateinit var etEmail:TextInputEditText
    lateinit var etPassword:TextInputEditText
    lateinit var tilEmail:TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvsignup=findViewById(R.id.tvsignup)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        tilEmail=findViewById(R.id.tilEmail)
        tilPassword=findViewById(R.id.tilPassword)
        tvsignup.setOnClickListener {
            val intent=Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            validate()
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)


        }

    }
    fun validate(){
        val Email=etEmail.text.toString()
        val Password=etPassword.text.toString()
        if (Email.isBlank()){
            tilEmail.error="invalid"
        }
        if (Password.isBlank()){
            tilPassword.error="invalid"
        }
    }
}