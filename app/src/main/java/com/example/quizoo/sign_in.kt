package com.example.quizoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_in.button1
import kotlinx.android.synthetic.main.activity_sign_in.editTextTextPassword
import kotlinx.android.synthetic.main.activity_sign_in.editTextTextPassword2

class sign_in : AppCompatActivity() {
    var mfirebaseAuth:FirebaseAuth?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_sign_in)

        mfirebaseAuth=FirebaseAuth.getInstance()

        button1.setOnClickListener(){
            val email1=editTextTextPassword.text.toString()
            val pswd1=editTextTextPassword2.text.toString()

            if (email1.isEmpty() || pswd1.isEmpty()){
                Toast.makeText(this,"u forgot to enter the email or ps", Toast.LENGTH_SHORT).show()
            }else{
                mfirebaseAuth?.signInWithEmailAndPassword(email1,pswd1)?.addOnCompleteListener(){
                    if (it.isSuccessful){
                        var gologin=Intent(this,categoy::class.java)
                        startActivity(gologin)
                    }else{
                        Toast.makeText(applicationContext,"can't login",Toast.LENGTH_SHORT).show()
                    }
                }

            }
        }
    }


}