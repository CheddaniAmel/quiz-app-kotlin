package com.example.quizoo

import android.content.Intent
import android.graphics.Color
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quesion_design.*

class quesion_design : AppCompatActivity(), View.OnClickListener {
    var submit=false

    private var mcurrentpos=1
    private var mquestionlist:ArrayList<questions>?=null
    private var mselectedchoicepos:Int=0
    private var mcorrectanswer:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quesion_design)

        mquestionlist = constants.getquestion()
        setquesiton()

        ndchoice.setOnClickListener(this)
        rdchoice.setOnClickListener(this)
        thchoice.setOnClickListener(this)
        stchoice.setOnClickListener(this)
        submitbtn.setOnClickListener(this)

        nextbtn.setOnClickListener(){
            this.mcurrentpos += 1
            this.setquesiton()

            submit=false
        }
}
    fun setquesiton(){
        defaultoptionview()
        if (mcurrentpos==mquestionlist!!.size){
            nextbtn.text="finish"

        }
        if (mcurrentpos>mquestionlist!!.size){
            val gotoresult=Intent(this,quizz_score::class.java)
            gotoresult.putExtra(constants.totalquestion, mquestionlist!!.size)
            gotoresult.putExtra(constants.correctanswer,mcorrectanswer)
            startActivity(gotoresult)
        }
        if (submit==false){
            nextbtn.isClickable=false
        }

        val quesionn = mquestionlist!![mcurrentpos-1]
        progress_bar.progress=mcurrentpos
        tv_progess.text="$mcurrentpos"+"/"+progress_bar.max
        tv_quesiton.text=quesionn.question
        imagesection.setImageResource(quesionn.image)
        tv_section.text=quesionn.section

        stchoice.text=quesionn.option_one
        ndchoice.text=quesionn.option_two
        rdchoice.text=quesionn.option_three
        thchoice.text=quesionn.option_four
    }
    private fun defaultoptionview(){
        var options=ArrayList<TextView>()
        options.add(0,stchoice)
        options.add(1,ndchoice)
        options.add(2,rdchoice)
        options.add(3,thchoice)

        for(option in options){
            option.background=ContextCompat.getDrawable(this,R.drawable.loginbutton)
        }
    }
    private fun selectedchoiceview(tv:TextView,choicenbr:Int){
        if (submit==false){
            defaultoptionview()
            tv.background=ContextCompat.getDrawable(this,R.drawable.clicked_button)
            mselectedchoicepos=choicenbr
        }

    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.stchoice->{
                selectedchoiceview(stchoice,1)

            }
            R.id.ndchoice->{
                selectedchoiceview(ndchoice,2)
            }
            R.id.rdchoice->{
                selectedchoiceview(rdchoice,3)
            }
            R.id.thchoice->{
                selectedchoiceview(thchoice,4)
            }



            R.id.submitbtn->{
                submit=true

                var qstion= mquestionlist?.get(mcurrentpos -1)
                if (qstion?.right_answer != mselectedchoicepos){
                    answer(mselectedchoicepos,R.drawable.wrong_answer)
                }else{
                    mcorrectanswer++
                }
                answer(qstion!!.right_answer,R.drawable.correct_answer)

                mselectedchoicepos=0

            }
        }
    }
    private fun answer(answer:Int,drawableview:Int){
        when(answer){
            1->{
                stchoice.background=ContextCompat.getDrawable(this,drawableview)
            }
            2->{
                ndchoice.background=ContextCompat.getDrawable(this,drawableview)
            }
            3->{
                rdchoice.background=ContextCompat.getDrawable(this,drawableview)
            }
            4->{
                thchoice.background=ContextCompat.getDrawable(this,drawableview)
            }
        }

    }

}