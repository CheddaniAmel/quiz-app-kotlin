package com.example.quizoo

object constants {

    const val  totalquestion:String="total questions"
    const val correctanswer:String="correct answers"
    fun getquestion ():ArrayList<questions>{
        val questionslist=ArrayList<questions>()

        val ques1=questions(
            R.drawable.design,
            "design",1,
            "what does ui mean ",
            "user interface",
            "user interaction",
            "user intent",
            "none of these answers",
            1)

        val ques2=questions(
            R.drawable.design,
            "design",2,
            "Which principle of Gestalt states that elements tend to be perceived as grouped together if they move together?",
            "closure principle",
            "Common fate principle",//true
            "Continuity principle",
            "none of these answers",
            2)
        val ques3=questions(
            R.drawable.design,
            "design",3,
            "The inventor of «cut & paste» command is: ",
            "Alan Kay",
            "Douglas Engelbart",
            "Larry Tesler",//true
            "none of these answers",
            3)
        val ques4=questions(
            R.drawable.design,
            "design",3,
            "How many columns by default are in Bootstrap's latest grid system? ",
            "12",
            "8",
            "16",
            "none of these answers",
            1)
        val ques5=questions(
            R.drawable.design,
            "design",3,
            "Doherty Threshold states that to keep users’ attention system needs to provide feedback within which timeframe?",
            "500ms",
            "600ms",
            "400ms",//true
            "none of these answers",
            3)
        val ques6=questions(
            R.drawable.design,
            "design",3,
            "«The time it takes to make a decision increases with the number and complexity of choices» is a statement of which law? ",
            "Fitt's Law",
            "Hick’s Law",//true
            "Jakob's Law",
            "none of these answers",
            2)
        val ques7=questions(
            R.drawable.design,
            "design",3,
            "Which company created Bootstrap UI framework? ",
            "Twitter",//true
            "Microsoft",
            "Google",
            "none of these answers",
            1)
        val ques8=questions(
            R.drawable.design,
            "design",3,
            "What's the default body font size in most browsers? ",
            "12px",
            "15xp",
            "17xp",
            "none of these answers",
            4)
        val ques9=questions(
            R.drawable.design,
            "design",3,
            "what's the hexadecimal code for white colour? ",
            "#FFFFFF",
            "#11FFFF",
            "#CCCCCC",
            "none of these answers",
            1)
        val ques10=questions(
            R.drawable.design,
            "design",3,
            "The spacing inside a UI element called...",
            "margin",
            "padding",//true
            "Gutter",
            "none of these answers",
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