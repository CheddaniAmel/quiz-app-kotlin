package com.example.quizoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quizz_score.*

class quizz_score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizz_score)
        supportActionBar?.hide()
        var totalqust=intent.getIntExtra(constants.totalquestion,10)
        var rightanswers=intent.getIntExtra(constants.correctanswer,5)
        tvscore.text="your score is $rightanswers out of $totalqust "
        btnfinish.setOnClickListener(){
            var gocateg= Intent(this,categoy::class.java)
            startActivity(gocateg)
        }
    }
}