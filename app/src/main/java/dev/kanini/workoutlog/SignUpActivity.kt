package dev.kanini.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import dev.kanini.workoutlog.databinding.ActivityLoginBinding
import dev.kanini.workoutlog.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
   lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
       binding=ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.tvlogin.setOnClickListener {
            val intent=Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.btnsignup.setOnClickListener {
            validate()
        }

    }
    fun validate(){
        val firstname=binding.etfirstname.text.toString()
        val lastname=binding.etlastname.text.toString()
        val email=binding.etemail.text.toString()
        val password=binding.etpassword.text.toString()
        val confirm=binding.etconfirm.text.toString()
        if (firstname.isBlank()){
            binding.tilfirstname.error="invalid"
        }
        if (lastname.isBlank()){
            binding.tilastname.error="invalid"
        }
        if (email.isBlank()){
            binding.tilemail.error="invalid"
        }
        if (password.isBlank()){
            binding.tilpassword.error="invalid"
        }
        if (confirm.isBlank()){
            binding.tilconfirm.error="invalid"
        }
        if(password!=confirm){
            binding.tilconfirm.error="mismatch"
        }

    }
}