package com.example.quizoo

object constants_web {

    const val  totalquestion:String="total questions"
    const val correctanswer:String="correct answers"
    fun getquestion ():ArrayList<questions>{
        val questionslist=ArrayList<questions>()

        val ques1=questions(
            R.drawable.web,
            "web dev",1,
            "What does HTML stand for? ",
            "Hyper Tag Markup Language",
            " Hyper Text Markup Language ",
            " Hyperlinks Text Mark Language ",
            " Hyperlinking Text Marking Language ",
            2)

        val ques2=questions(
            R.drawable.web,
            "web dev",2,
            " What symbol indicates a tag? ",
            "Angle brackets e.g. ",
            "Curved brackets e.g. {,}",
            "Curved brackets e.g. {,}",
            "Exclamation marks e.g. ! ",
            2)
        val ques3=questions(
            R.drawable.web,
            "web dev",3,
            "Which of these is a genuine tag keyword?",
            "Header ",
            "Bold",
            " Body",
            "Image ",
            3)
        val ques4=questions(
            R.drawable.web,
            "web dev",3,
            "What is the correct tag for a line break? ",
            " brk/ ",
            "line /",
            "bk /",
            "br /",
            4)
        val ques5=questions(
            R.drawable.web,
            "web dev",3,
            " What does CSS stand for? ",
            " Computing Style Sheet ",
            " Creative Style System ",
            " Creative Style System ",
            "Creative Styling Sheet ",
            3)
        val ques6=questions(
            R.drawable.web,
            "web dev",3,
            "Where should a CSS file be referenced in a HTML file?",
            "Before any HTML code",
            "After all HTML code ",//true
            "Inside the head section",
            "Inside the body section ",
            3)
        val ques7=questions(
            R.drawable.web,
            "web dev",3,
            "What is the correct format for aligning written content to the center of the page in CSS?  ",
            "Text-align:center;",//true
            "Font-align:center;",
            "Text:align-center;",
            "Font:align-center;",
            1)
        val ques8=questions(
            R.drawable.web,
            "web dev",3,
            "What is the correct format for changing the background colour of a div in CSS? ",
            "Bg-color:red; ",
            " Background:red; ",
            " Background-colour:red; ",
            " Background-color:red;",
            4)
        val ques9=questions(
            R.drawable.web,
            "web dev",3,
            "what's the hexadecimal code for white colour? ",
            "#FFFFFF",
            "#11FFFF",
            "#CCCCCC",
            "none of these answers",
            1)
        val ques10=questions(
            R.drawable.web,
            "web dev",3,
            "What is the correct format for a div? ",
            "Div-id=example",
            "Div id=\"example\"",//true
            "\n" + "Div=\"example\"",
            "Div.example",
            2)


        questionslist.add(ques1)
        questionslist.add(ques2)
        questionslist.add(ques3)
        questionslist.add(ques4)
        questionslist.add(ques5)
        questionslist.add(ques6)
        questionslist.add(ques7)
        questionslist.add(ques8)
        questionslist.add(ques9)
        questionslist.add(ques10)
        return questionslist
    }
}