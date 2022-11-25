package com.example.quizoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login_or_signup.*

class login_or_signup : AppCompatActivity() {
    var mfirebaseAuth: FirebaseAuth?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_login_or_signup)

        mfirebaseAuth=FirebaseAuth.getInstance()
        signupbtn.setOnClickListener{
            var gosignup=Intent(this,sign_up::class.java)
            startActivity(gosignup)
        }
        btnlogin.setOnClickListener{
            var gosignin=Intent(this,sign_in::class.java)
            startActivity(gosignin)
        }
    }
    /*override fun onStart() {//to keep the user signed in but t doesn't work
        super.onStart()
        if (mfirebaseAuth?.currentUser !=null){
            val gomainactiv=Intent(this,categoy::class.java)
            startActivity(gomainactiv)
        }
    }*/
}