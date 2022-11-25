package com.example.quizoo

object constants_mobdev {
        const val  totalquestion:String="total questions"
        const val correctanswer:String="correct answers"
        fun getquestion ():ArrayList<questions>{
            val questionslist=ArrayList<questions>()

            val ques1=questions(
                R.drawable.mobile,
                "mobile dev",1,
                "When should you start considering mobile app development for your business? ",
                "When your mobile Web experience lacks features or offers a poor user experience",
                "When your customers or employees ask for apps",
                "When competitors release their own mobile apps",
                "Any of the above",
                4)

            val ques2=questions(
                R.drawable.mobile,
                "mobile dev",2,
                "If you're planning to build a mobile app, which of these issues is most important?",
                "Platform",
                "Security",
                "Usability",
                "All three",
                3)
            val ques3=questions(
                R.drawable.mobile,
                "mobile dev",3,
                "What is the most effective way for a development team to manage the constant updates necessary for business-critical mobile apps?: ",
                "Assign a team to push out updates on a regular basis",
                "Draw straws to determine which team has to publish the next update",
                "Automate deployment so finished updates go out on a schedule",//true
                "Farm out update duties to a third party",
                3)
            val ques4=questions(
                R.drawable.mobile,
                "mobile dev",3,
                "Aside from deployment, what other parts of the application lifecycle can be automated? ",
                "Moving code to test environments",
                "Coding the app",
                "2nd and 4th answers",
                "Delivering failed test reports to the developer's inbox",
                1)
            val ques5=questions(
                R.drawable.mobile,
                "mobile dev",3,
                "Doherty Threshold states that to keep users’ attention system needs to provide feedback within which timeframe?",
                "500ms",
                "600ms",
                "400ms",//true
                "none of these answers",
                3)
            val ques6=questions(
                R.drawable.mobile,
                "mobile dev",3,
                "«The time it takes to make a decision increases with the number and complexity of choices» is a statement of which law? ",
                "Fitt's Law",
                "Hick’s Law",//true
                "Jakob's Law",
                "none of these answers",
                2)
            val ques7=questions(
                R.drawable.mobile,
                "mobile dev",3,
                "Which company created Bootstrap UI framework? ",
                "Twitter",//true
                "Microsoft",
                "Google",
                "none of these answers",
                1)
            val ques8=questions(
                R.drawable.mobile,
                "mobile dev",3,
                "What's the default body font size in most browsers? ",
                "12px",
                "15xp",
                "17xp",
                "none of these answers",
                4)
            val ques9=questions(
                R.drawable.mobile,
                "mobile dev",3,
                "what's the hexadecimal code for white colour? ",
                "#FFFFFF",
                "#11FFFF",
                "#CCCCCC",
                "none of these answers",
                1)
            val ques10=questions(
                R.drawable.mobile,
                "mobile dev",3,
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