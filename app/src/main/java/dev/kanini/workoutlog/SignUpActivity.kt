package dev.kanini.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var etfirstname:EditText
    lateinit var tilfirstname:TextInputLayout
    lateinit var etlastname:EditText
    lateinit var tilastname:TextInputLayout
    lateinit var etemail:EditText
    lateinit var tilemail:TextInputLayout
    lateinit var etpassword:EditText
    lateinit var tilpassword:TextInputLayout
    lateinit var etconfirm:EditText
    lateinit var tilconfirm:TextInputLayout
    lateinit var btnsignup:Button
    lateinit var tvlogin:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        etfirstname=findViewById(R.id.etfirstname)
        tilfirstname=findViewById(R.id.tilfirstname)
        etlastname=findViewById(R.id.etlastname)
        tilastname=findViewById(R.id.tilastname)
        etemail=findViewById(R.id.etemail)
        tilemail=findViewById(R.id.tilemail)
        etpassword=findViewById(R.id.etpassword)
        tilpassword=findViewById(R.id.tilpassword)
        etconfirm=findViewById(R.id.etconfirm)
        tilconfirm=findViewById(R.id.tilconfirm)
        btnsignup=findViewById(R.id.btnsignup)
        tvlogin=findViewById(R.id.tvlogin)
        tvlogin.setOnClickListener {
            val intent=Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
        btnsignup.setOnClickListener {
            validate()
        }

    }
    fun validate(){
        val firstname=etfirstname.text.toString()
        val lastname=etlastname.text.toString()
        val email=etemail.text.toString()
        val password=etpassword.text.toString()
        val confirm=etconfirm.text.toString()
        if (firstname.isBlank()){
            tilfirstname.error="invalid"
        }
        if (lastname.isBlank()){
            tilastname.error="invalid"
        }
        if (email.isBlank()){
            tilemail.error="invalid"
        }
        if (password.isBlank()){
            tilpassword.error="invalid"
        }
        if (confirm.isBlank()){
            tilconfirm.error="invalid"
        }
        if(password!=confirm){
            tilconfirm.error="mismatch"
        }



    }
}