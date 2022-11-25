package com.example.quizoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_up.*

class sign_up : AppCompatActivity() {
    var mfirebaseAuth:FirebaseAuth?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        setContentView(R.layout.activity_sign_up)
        mfirebaseAuth=FirebaseAuth.getInstance()

        textView4.setOnClickListener(){
            var gotologin=Intent(this,sign_in::class.java)
            startActivity(gotologin)
        }
        button1.setOnClickListener(){
            val email=editTextTextEmailAddress.text.toString()
            val pswd=editTextTextPassword.text.toString()
            val confirm_pswrd=editTextTextPassword2.text.toString()

            if (email.isEmpty() || pswd.isEmpty() || confirm_pswrd.isEmpty()){
                Toast.makeText(this,"u forgot to enter the email or ps",Toast.LENGTH_SHORT).show()
            }else{
                if (pswd.length < 8){
                    Toast.makeText(this, "your password is short", Toast.LENGTH_SHORT).show()
                }else{
                    if (pswd != confirm_pswrd){
                        Toast.makeText(this, "your passwpord is wrong", Toast.LENGTH_SHORT).show()
                    }else{
                        mfirebaseAuth!!.createUserWithEmailAndPassword(email,pswd).addOnCompleteListener {
                            if (it.isSuccessful){
                                Toast.makeText(applicationContext,"welcom to quizoo",Toast.LENGTH_SHORT).show()
                                val gosignin=Intent(this,categoy::class.java)
                                startActivity(gosignin)
                            }else{

                                Toast.makeText(applicationContext,it.exception.toString(),Toast.LENGTH_LONG).show()
                            }
                        }


                        }
                    }
                }
            }

        }
    }